<!DOCTYPE html>
<html lang="en">
<head>
    <!---Student Number: C00305107
    Name: Samuel Asuoha 
    Date: 18/03/2024-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>welcome.php</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="container">
        <?php
            $firstname = $_POST['firstname'];
            $lastname = $_POST['lastname'];
            $Subject = $_POST['Subject'];
            $level = $_POST['level'];
            $date = $_POST['date'];

            echo "<p>Dear, $firstname $lastname,</p> <p>Thank you for submitting your preference</p><br/>";
            echo "The $level level presentation on $Subject is confirmed for the $date.</p>";
        ?>
    </div>
</body>
</html>
