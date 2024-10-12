<?php
// Initialize variables to store user input and error messages
$name = $email = $message = "";
$nameErr = $emailErr = $messageErr = "";

// Check if the form is submitted using the POST method
if ($_SERVER["REQUEST_METHOD"] == "POST") {

    // Validate the name field
    if (empty($_POST["name"])) {
        $nameErr = "Name is required";
    } else {
        $name = sanitize_input($_POST["name"]);
        // Only allow letters and white space
        if (!preg_match("/^[a-zA-Z-' ]*$/", $name)) {
            $nameErr = "Only letters and white space allowed";
        }
    }

    // Validate the email field
    if (empty($_POST["email"])) {
        $emailErr = "Email is required";
    } else {
        $email = sanitize_input($_POST["email"]);
        // Validate email format
        if (!filter_var($email, FILTER_VALIDATE_EMAIL)) {
            $emailErr = "Invalid email format";
        }
    }

    // Validate the message field
    if (empty($_POST["message"])) {
        $messageErr = "Message is required";
    } else {
        $message = sanitize_input($_POST["message"]);
    }

    // If there are no errors, you can proceed with form processing or data storage
    if (empty($nameErr) && empty($emailErr) && empty($messageErr)) {
        // You can store the data to the database, send an email, etc.
    }
}

// Function to sanitize input to prevent XSS attacks
function sanitize_input($data) {
    $data = trim($data);
    $data = stripslashes($data);
    $data = htmlspecialchars($data);
    return $data;
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PHP Form Handling Example</title>
    <style>
        .error { color: red; }
        .container { width: 50%; margin: 0 auto; padding: 20px; }
    </style>
</head>
<body>
    <div class="container">
        <h2>PHP Form Example</h2>
        <p><span class="error">* required field</span></p>

        <!-- Form to take user input -->
        <form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>">
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" value="<?php echo $name; ?>">
            <span class="error">* <?php echo $nameErr; ?></span>
            <br><br>

            <label for="email">Email:</label>
            <input type="text" id="email" name="email" value="<?php echo $email; ?>">
            <span class="error">* <?php echo $emailErr; ?></span>
            <br><br>

            <label for="message">Message:</label>
            <textarea id="message" name="message" rows="5" cols="40"><?php echo $message; ?></textarea>
            <span class="error">* <?php echo $messageErr; ?></span>
            <br><br>

            <input type="submit" value="Submit">
        </form>

        <!-- Display the result -->
        <?php if ($_SERVER["REQUEST_METHOD"] == "POST" && empty($nameErr) && empty($emailErr) && empty($messageErr)): ?>
        <h3>Your Submitted Information:</h3>
        <p><strong>Name:</strong> <?php echo $name; ?></p>
        <p><strong>Email:</strong> <?php echo $email; ?></p>
        <p><strong>Message:</strong> <?php echo nl2br($message); ?></p>
        <?php endif; ?>
    </div>
</body>
</html>
