<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Profile</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.css" rel="stylesheet">
</head>

${profile_background!"no back"}
<body style="background-color: ${profile_background!"white"}">

<div class="container">
    <h2>My profile</h2>

    <form action="/profile" method="post">
    <p>Select new background:</p>
    <select name="background">
        <option value="white" selected>White</option>
        <option value="green">Green</option>
        <option value="red">Red</option>
        <option value="yellow">Yellow</option>
    </select>
    <input type="submit" value="Submit">
    </form>
</div> <!-- /container -->

</body>
</html>