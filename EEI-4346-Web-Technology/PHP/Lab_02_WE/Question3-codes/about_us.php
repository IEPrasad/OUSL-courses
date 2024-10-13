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

        .info {
            font-size: 18px;
            line-height: 1.8;
        }

        .info strong {
            color: #e67e22;
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

    <div class="container">
        <h2>About Us</h2>

        <div class="info">
            <p>Welcome to <strong>IEP Travels Sri Lanka</strong>, your trusted partner for unforgettable travel experiences. Based in the beautiful coastal town of Matara, our office is located near the serene Polhena beach, a perfect starting point for your Sri Lankan adventures.</p>

            <p>At IEP Travels, we are committed to providing exceptional services to our clients, offering a range of travel packages that cover the best destinations in Sri Lanka. Whether you’re interested in cultural tours, beach vacations, or adventure trips, we’ve got you covered!</p>
        </div>

        <a href="http://localhost/codeIG3/index.php/lab2/contact_us" class="btn">Contact Us</a>
        <a href="http://localhost/codeIG3/index.php/lab2/index" class="back-btn">Back to Home</a>
    </div>

</body>
</html>
