<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title><?php echo $title; ?></title>

    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
            color: #333;
        }

        .container {
            width: 80%;
            margin: 20px auto;
            padding: 20px;
            background-color: white;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            border-radius: 8px;
        }

        h2 {
            text-align: center;
            color: #2c3e50;
            margin-bottom: 20px;
            font-size: 28px;
            text-transform: uppercase;
            letter-spacing: 1.5px;
        }

        .contact-details {
            font-size: 18px;
            line-height: 1.8;
        }

        .contact-details strong {
            color: #e67e22;
            font-weight: bold;
        }

        .contact-details p {
            font-size: 16px;
            margin-bottom: 10px;
        }

        .contact-details span {
            color: #2980b9;
            font-weight: bold;
        }

        .btn, .back-btn {
            display: inline-block;
            padding: 10px 20px;
            background-color: #2980b9;
            color: white;
            text-decoration: none;
            border-radius: 4px;
            transition: background-color 0.3s ease;
            margin-top: 20px;
        }

        .btn:hover, .back-btn:hover {
            background-color: #e67e22;
        }

        .back-btn {
            margin-left: 10px;
        }

    </style>
</head>
<body>

    <!-- Container for Contact Content -->
    <div class="container">
        <h2>Contact Us</h2>

        <div class="contact-details">
            <p><strong>Office Location:</strong> Matara, Polhena</p>
            <p><strong>Email:</strong> <span>ieptravels@gmail.com</span></p>
            <p><strong>Contact Number:</strong> <span>0767721718</span></p>
        </div>

        <a href="mailto:ieptravels@gmail.com" class="btn">Email Us</a>
        <a href="http://localhost/codeIG3/index.php/lab2/index" class="back-btn">Back to Home</a>
    </div>

</body>
</html>
