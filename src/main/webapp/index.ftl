<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>index</title>
</head>
<body>
<h2>Enter your name:</h2>
<form action="hello" method="get">
    <input type="text" name="username">
    <button type="submit">OK</button>
</form>

<#if error?? && error>
    <p>You have an error</p>
</#if>
</body>
</html>