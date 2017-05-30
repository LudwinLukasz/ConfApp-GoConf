<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html lang="pl">
	<head>
		<meta charset="UTF-8">
		<title>Papers</title>
		<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	    		rel="stylesheet">
	</head>

<body>

<div class="container">
<table class="table table-striped">
	<caption> Artykuły</caption>
	<thead>
		<tr>
			<th>Autor</th>
			<th>Temat</th>
			<th>Dziedzina</th>
			<th>Opis</th>
			<th>Status</th>
			<th>Usuń</th>
			<th>Dodaj Plik</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${papers}" var="paper">
		<tr>
			<td>${paper.author}</td>
			<td>${paper.topic}</td>
			<td>${paper.branch}</td>
			<td>${paper.desc}</td>
			<td>${paper.status}</td>
			<td><a type="button" class="btn btn-warning"
			href="/delete-paper?id=${paper.id}">Usuń</a></td>
			<td><a type="button" class="btn btn-success"
			href="/ala?id=${paper.id}">Plik</a></td>
		</tr>
</c:forEach>
</tbody>
</table>
<a type="button" class="btn btn-success"
			href="/add-paper">Dodaj artykuł</a>

<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</div>
</body>

</html>