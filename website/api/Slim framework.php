<?php
//This code uses the Slim framework to handle the routing and HTTP requests and responses. The first API is a GET request to the /users
// API to return all users
$app->get('/users', function () use ($app) {
    $users = getUsers();
    $app->response()->header('Content-Type', 'application/json');
    echo json_encode($users);
});

// API to return a specific user by id
$app->get('/users/:id', function ($id) use ($app) {
    $user = getUser($id);
    $app->response()->header('Content-Type', 'application/json');
    echo json_encode($user);
});

// API to create a new user
$app->post('/users', function () use ($app) {
    $user = $app->request()->post();
    $id = createUser($user);
    $app->response()->header('Content-Type', 'application/json');
    echo json_encode(array("id" => $id));
});

$app->run();