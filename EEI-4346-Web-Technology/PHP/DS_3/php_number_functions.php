<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h2>PHP Number Functions</h2>
    <br><br><br>
    
    <?php
        $name = 'Eranda';
        echo is_float($name); // no output
        echo is_string($name); // >>> 1
        // echo "hello";
    ?>
</body>
</html>

<!-- 
is_int() - Check if the type of a variable is int
is_float() - Check if the type of a variable is float
is_numeric() - Check if the variable is numeric
(int)$variable_name - Cast float to int
-->
