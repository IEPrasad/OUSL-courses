<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
</head>
<body>

<?php
  // Check if 'name' parameter is set in the URL
  if (isset($_GET['name']) && !empty($_GET['name'])) {
      $name = htmlspecialchars($_GET['name']); // Sanitize the input
      echo "<h2>Hello, $name!</h2>";
  }
?>

<form action="#" method="GET">
  <label>
    Enter your name:
    <input type="text" name="name">
    <input type="submit" value="SUBMIT">
  </label>
</form>

</body>
</html>
