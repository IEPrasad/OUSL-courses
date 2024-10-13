<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Question2</title>
</head>
<body>

    <?php
    function calculate_average($values) {
        $sum = array_sum($values);
        $average = $sum / count($values);
        return $average;
    }

    if (isset($_GET['value1']) && isset($_GET['value2']) && isset($_GET['value3']) && isset($_GET['value4']) && isset($_GET['value5'])) {
        $value1 = intval($_GET['value1']);
        $value2 = intval($_GET['value2']);
        $value3 = intval($_GET['value3']);
        $value4 = intval($_GET['value4']);
        $value5 = intval($_GET['value5']);
        
        $values = [$value1, $value2, $value3, $value4, $value5];
        
        $average = calculate_average($values);
        
        echo "Entered values are: " . implode(", ", $values) . "<br>";
        echo "The average is: " . $average;
    } else {
        echo "Please enter all values.";
    }
    ?>


    <form action="#" method="GET">
        <div>
            <div>
                <label>Enter first value: </label>
                <input type="text" name="value1">    
            </div>
            <br>
            <div>
                <label>Enter second value: </label>
                <input type="text" name="value2">    
            </div>
            <br>
            <div>
                <label>Enter third value: </label>
                <input type="text" name="value3">    
            </div>
            <br>
            <div>
                <label>Enter fourth value: </label>
                <input type="text" name="value4">
            </div>
            <br>
            <div>
                <label>Enter fifth value: </label>
                <input type="text" name="value5">
            </div>
            <br>
            <input type="submit" value="Calculate Average">
        </div>
    </form>
</body>
</html>
