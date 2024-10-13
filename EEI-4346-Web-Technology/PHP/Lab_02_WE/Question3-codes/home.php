<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title><?php echo $title?></title>

    <style>
        .nav {
            display: flex;
            flex-direction: row;
            background-color: black;
            padding: 8px 12px;
            position: fixed;
            left: 0;
            right: 0;
            top: 0;
            align-items: center;
            justify-content: center;
        }
        .nav a {
            background-color: white;
            color: black;
            font-family: sans-serif;
            padding: 6px 9px;
            transition: background-color 0.25s;
            margin: 0px 12px;
            text-decoration: none;
        }
        
        .nav a:hover {
            background-color: rgb(198, 108, 13);
        }
        .nav a:active {
            opacity: 0.7;
        }

        h2 {
            position: relative;
            /* top: 40px; */
            font-family: cursive;
            font-size: 25px;
            color: orange;
            background-color: green;
            align-items: center;
            justify-content:center;
            display: flex;
            width: auto;
        }

        .box {
            background-color: rgba(214, 169, 169, 0.5);
            border: 2px solid black;
            border-radius: 5px;
            box-shadow: 5px 9px 8px rgba(0, 0, 0, 0.5);
            width: 400px;
            height: 320px;
            margin: 20px;
            align-items: center;
            justify-content: center;
            padding: 5px 12px;
        }

        body {
            padding-top: 50px;
        }

        .footer {
            color: white;
            margin: 0 10px;
            text-decoration: none;
            position: fixed;
            bottom: 0;
            right: 0;
            left: 0;
            background-color: black;
            font-family: 'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Arial, sans-serif;
            display: flex;
            align-items: center;
            flex-direction: row;
            justify-content: space-around;
        }
        .footer a:hover {
            color: orange;
        }
    </style>

</head>
<body>
    
    <h2>
        IEP Traveles Sri Lanka
    </h2>

    <div class='nav'>
        <a href="">home </a> &nbsp; &nbsp;
        <a href="http://localhost/codeIG3/index.php/lab2/contact_us">Contact Us</a> &nbsp; &nbsp;
        <a href="http://localhost/codeIG3/index.php/lab2/about_us">About Us</a> &nbsp; &nbsp;
    </div>

    <div class="box">
        <h3>Our services</h3>

        <p>
            IEP Travels offers the best travel experience in Sri Lanka, providing guided tours to scenic
            locations like Sigiriya, Galle, and Kandy. Enjoy your vacation with our tailored packages
            that fit all types of travelers!
        </p>
        <h3>Popular Tourist Places in Sri Lanka</h2>
        <p>
            From the golden beaches of Bentota to the lush greenery of Ella, discover the most breathtaking
            tourist attractions in Sri Lanka with IEP Travels.
        </p>

    </div>

    <div class="footer">
        <p>Connect with us:</p>
        <a href="https://www.facebook.com/IEPTravels" target="_blank">Facebook</a> |
        <a href="https://www.youtube.com/IEPTravels" target="_blank">YouTube</a>
    </div>
</body>
</html>