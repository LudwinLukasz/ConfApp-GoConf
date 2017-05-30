<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<body>

<h1>Spring Boot ładowanie plików</h1>

<form method="POST" action="/upload" enctype="multipart/form-data">
    <input type="file" name="file" /><br/><br/>
    <input type="submit" value="Submit" />
</form>

</body>
</html>