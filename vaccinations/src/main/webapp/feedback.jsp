<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="send.do">
<pre>
Email<input type="text" name="email" />
Name<input type="text" name="name" />
Rating<select name="rating">
<option>1</option>
<option>2</option>
<option>3</option>
</select>
Comments<textarea rows="3" cols="20" name="comments"></textarea>
<input type="submit" value="send">
</pre>
</form>
</body>
</html>