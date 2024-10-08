<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php 
        $name = 'Eranda';
        echo strlen($name) . '<br>'; // 6
        // strlen() - Return the length of a string 

        
        $vilage = 'Matara kalubovitiyana';
        echo str_word_count($vilage);
    ?>
</body>
</html>
<!-- 
// to run the local host 
// navigate cmd into this file location using CD commnad
// php -S localhost:8000 
// like this run local host 
// got to web browser
// localhost:8000/php_file_name.php
// then you can see the out put of the file...  -->


<!-- 
strlen() - Return the length of a String
str_word_counter() - count Words in a String 
strrrev() - Reverse a String
strpos() - Search For a text withing a string
str_replace() - Replace text within a string 
-->
