<?php

$ip = $_SERVER['REMOTE_ADDR'];

echo "Your IP Address is: " . $ip . "<br>";

// RESTful API 1
$url = "http://api.ipstack.com/" . $ip . "?access_key=YOUR_ACCESS_KEY";
$data = json_decode(file_get_contents($url));
echo "City: " . $data->city . "<br>";
echo "Region: " . $data->region_name . "<br>";

// RESTful API 2
$url = "http://api.weatherstack.com/current?access_key=YOUR_ACCESS_KEY&query=" . $ip;
$data = json_decode(file_get_contents($url));
echo "Temperature: " . $data->current->temperature . "<br>";
echo "Weather: " . $data->current->weather_descriptions[0] . "<br>";

// RESTful API 3
$url = "http://api.timezonedb.com/v2/get-time-zone?key=YOUR_ACCESS_KEY&format=json&by=ip&ip=" . $ip;
$data = json_decode(file_get_contents($url));
echo "Timezone: " . $data->zoneName . "<br>";
echo "Local Time: " . $data->formatted . "<br>";

?>
