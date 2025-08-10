<!---Student Number: C00305107
    Name: Samuel Asuoha-->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Contact Us</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    
    <div class="container">
        <?php
            $name = $_POST['name'];
            $email = $_POST['email'];
            $message = $_POST['message'];
            $gender = $_POST["gender"];
            $country = $_POST["country"];

            echo "<p>Dear $name,</p><br/><p>Your message has been sent successfully.</p><br/><p>We'll get back to you shortly.</p><br/>";
        
        ?>
    </div>
</body>
</html>



