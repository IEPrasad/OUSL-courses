<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Display Name</title>
</head>
<body>

<h2>Enter Your Name</h2>
<form method="GET" action="">
    <label for="username">Name:</label>
    <input type="text" id="username" name="username" required>
    <input type="submit" value="Submit">
</form>

<?php
if (isset($_GET['username'])) {
    $name = htmlspecialchars($_GET['username']); // Sanitize input
    echo "<h3>Hello, " . $name . "!</h3>";
}
?>

</body>
</html>
