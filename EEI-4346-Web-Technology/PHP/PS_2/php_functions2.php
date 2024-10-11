<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PHP Function Example</title>
</head>
<body>
    <h1>Advanced PHP Function Example</h1>

    <?php
    // An advanced function that calculates the factorial of a number using recursion
    function factorial($n) {
        if ($n <= 1) {
            return 1;
        } else {
            return $n * factorial($n - 1);
        }
    }

    // Another function with default parameters and handling arrays
    function calculateSum($numbers = [1, 2, 3]) {
        $sum = 0;
        foreach ($numbers as $num) {
            $sum += $num;
        }
        return $sum;
    }

    // Calling the advanced functions and displaying the results within the HTML
    echo "<p>Factorial of 5 is: " . factorial(5) . "</p>";
    echo "<p>Sum of array [10, 20, 30] is: " . calculateSum([10, 20, 30]) . "</p>";
    ?>
</body>
</html>
