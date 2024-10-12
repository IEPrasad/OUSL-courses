<?php
// Initialize variables to store user input and error messages
$name = $email = $message = "";
$nameErr = $emailErr = $messageErr = "";
$displayData = false; // Flag to check if data should be displayed

// Check if the form is submitted using the POST method
if ($_SERVER["REQUEST_METHOD"] == "POST") {

    // Validate the name field
    if (empty($_POST["name"])) {
        $nameErr = "Name is required";
    } else {
        $name = sanitize_input($_POST["name"]);
        if (!preg_match("/^[a-zA-Z-' ]*$/", $name)) {
            $nameErr = "Only letters and white space allowed";
        }
    }

    // Validate the email field
    if (empty($_POST["email"])) {
        $emailErr = "Email is required";
    } else {
        $email = sanitize_input($_POST["email"]);
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

    // If no errors, set displayData to true to show the results
    if (empty($nameErr) && empty($emailErr) && empty($messageErr)) {
        $displayData = true;
    }
}

// Function to sanitize input to prevent XSS
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
    <script>
        // JavaScript function to reset form fields after submission
        function clearForm() {
            document.getElementById("userForm").reset();  // Resets the form inputs
        }

        // Call this function on page load to clear the input fields
        window.onload = function() {
            clearForm();
        };
    </script>
</head>
<body>
    <div class="container">
        <h2>PHP Form Example</h2>
        <p><span class="error">* required field</span></p>

        <!-- Form with an ID for JavaScript access -->
        <form id="userForm" method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>">
            <label for="name">Name:</label>
            <input type="text" id="name" name="name">
            <span class="error">* <?php echo $nameErr; ?></span>
            <br><br>

            <label for="email">Email:</label>
            <input type="text" id="email" name="email">
            <span class="error">* <?php echo $emailErr; ?></span>
            <br><br>

            <label for="message">Message:</label>
            <textarea id="message" name="message" rows="5" cols="40"></textarea>
            <span class="error">* <?php echo $messageErr; ?></span>
            <br><br>

            <input type="submit" value="Submit">
        </form>

        <!-- Display the result -->
        <?php if ($displayData): ?>
        <h3>Your Submitted Information:</h3>
        <p><strong>Name:</strong> <?php echo $name; ?></p>
        <p><strong>Email:</strong> <?php echo $email; ?></p>
        <p><strong>Message:</strong> <?php echo nl2br($message); ?></p>

        <!-- Clear form after submission -->
        <script>
            clearForm();
        </script>
        <?php endif; ?>
    </div>
</body>
</html>
