<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>corona vaccination form</h2>
<h4><span style="color:red;">${message}</span></h4>
<form action="Register.do">
<pre>
Name<input type="text" name="name"/>
Age<select name="age"/>
<option>less than 18</option>
<option>greater than 18,less than 45</option>
<option>greater than 45,less than 60</option>
<option>greater than 60</option>
</select>
Adhar<input type="text" name="adhar" />
Location<select name="Location"/>
<option>bnglr</option>
<option>mysr</option>
<option>mandya</option>
</select>
Mobile Number<input type="text" name="mobile"/>
Submit<input type="submit" value="Register"/>
</pre>
</form>
<a href="feedback.do">feedback</a>
</body>
</html>
