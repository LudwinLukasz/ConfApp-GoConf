<%@ page contentType="text/html; charset=UTF-8" %>
<html lang="pl">
	<head>
		<meta charset="UTF-8">
		<title>Papers</title>
		<link type="text/css" rel="stylesheet" href="style.css">
	</head>

<body>
${name}
<br/>

<form method="post">
	Autor: <input name="author" type="text"/> 
	Temat : <input name="topic" type="text"/> 
	Dziedzina: <input name="branch" type="text"/>
	Opis: <input name="desc" type="text"/>
	<input type="submit"/>	
</form>

</body>

</html>