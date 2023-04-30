fetch('/data')
  .then(response => response.json())
  .then(data => {
    console.log(data);
    // data will be { name: 'Aaron', age: 30 }
  });