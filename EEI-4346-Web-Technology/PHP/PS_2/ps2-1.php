<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h2>This is the first file with the xampp server</h2>

    <?php 

        $age = 20;

        echo "<br/>";
        echo "String Functions";
        echo "<br/>";
        echo "<br/>";

        echo strlen("Programming"); // >>> 11

        echo "<br/>";

        echo str_word_count("The open university of Sri Lanka"); // >>> 6
        
        echo "<br/>";

        echo strrev("Hello"); // >>> olleH

        echo "<br/><br/>";

        if ($age > 18) {
            echo "You are eligible for voting";
        } else {
            echo "You are not eligible for voting";
        }
    
    ?>
</body>
</html>

<!-- 
    PHP operations 

        Operator    Name                Example
        
        +           Addition            $x + $y
        -           Substraction        $x - $y
        *           Multiplication      $x * $y
        /           Division            $x / $y
        %           Modulus             $x % $y
        **          Exponentation       $x ** $y
-->

<!-- 
    if (condition) {
        code to be executed if the condtion is true;
    } else {
        code to be executed if the condition is false; 
    }

-->
