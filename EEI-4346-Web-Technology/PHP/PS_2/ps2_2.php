<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php 
        echo "<h2> Loops </h2>";

        echo "<br/><br/>";

        echo "For loop <br/>";
        for ($i = 0; $i < 5; $i++) {
            echo $i , "<br/>";
        }
        
        echo "while loop <br/>";
        $x = 0;
        while ($x < 5) {
            echo $x, "<br/>";
            $x ++;
        }

        echo "do while loop<br/>";
        $y = 0;
        do {
            echo $y, "<br/>";
            $y++;
        } while ($y < 5);

    ?>
</body>
</html>

<!-- 
    PHP Loops
        For Loop:

            for (int counter; test counter; increment counter) {
                code to be executed for each iteration;
            }
        
        While Loop:

            while (condition is true) {
                code to be executed;
                increment;
            }

        Do while loop:

            do {
                code to be executed;
                increment;
            } while (condition is true);
-->
