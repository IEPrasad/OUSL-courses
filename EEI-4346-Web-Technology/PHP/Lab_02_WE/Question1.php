<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<?php
    if (isset($_GET['gpa_value'])) {
        $gpa_value = floatval($_GET['gpa_value']); 
        
        if ($gpa_value >= 4) {
            echo "First Class";
        } elseif ($gpa_value >= 3.7) {
            echo "Second Class Upper";
        } elseif ($gpa_value >= 3.3) {
            echo "Second Class Lower";
        } elseif ($gpa_value >= 2) {
            echo "General Pass";
        } else {
            echo "Invalid GPA value or Fail";
        }
    } else {
        echo "Please enter a GPA value.";
    }
    ?>


    <form action="#" method="GET">
        <label>Enter your GPA value: </label>
        <input type="text" name="gpa_value">
        <input type="submit" value="SUBMIT">
    </form>
</body>
</html>