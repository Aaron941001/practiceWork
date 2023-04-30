// First, we create a new instance of the XMLHttpRequest object
var xhr = new XMLHttpRequest();

// Next, we define a callback function that will be called when the API sends back a response
xhr.onreadystatechange = function() {
  // Check if the request is complete and successful
  if (xhr.readyState === 4 && xhr.status === 200) {
    // Parse the JSON response from the API
    var data = JSON.parse(xhr.responseText);

    // Update the contents of the webpage with the data from the API
    var container = document.getElementById("data-container");
    container.innerHTML = "";
    for (var i = 0; i < data.length; i++) {
      var item = document.createElement("p");
      item.innerHTML = data[i].name;
      container.appendChild(item);
    }
  }
};

// Finally, we send the request to the API
xhr.open("GET", "https://jsonplaceholder.typicode.com/users", true);
xhr.send();
