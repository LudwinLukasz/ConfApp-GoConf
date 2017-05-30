<%@ page contentType="text/html; charset=UTF-8" %>
<html lang="pl">
	<head>
		<meta charset="UTF-8">
		<title>Login</title>
		<link type="text/css" rel="stylesheet" href="style.css">
	</head>

<body>
<p>${errorMessage}</p>
	<form method="post">
		Login : <input type="text" name="name" />
		Hasło : <input type="password" name="password" /> 
		<input type="submit" />
	</form>
</body>

</html>