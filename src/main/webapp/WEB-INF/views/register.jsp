<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="registerUser" method="post">
<h1>Register User</h1>
<table>
<tr>
<td>FirstName</td>
<td><input type="text" name="firstname"></td>
</tr>
<tr>
<td>LastName</td>
<td><input type="text" name="lastname"></td>
</tr>
<tr>
<td>UserName</td>
<td><input type="text" name="email"></td>
</tr>
<tr>
<td>Password</td>
<td><input type="text" name="password"></td>
</tr>
<tr>
<td>Confirm Password</td>
<td><input type="text" name="cpassword"></td>
</tr>

<tr>
<td><input type="hidden" name="role" value="0"></td>
<td><input type="submit" value="Save"></td>
</tr>
</table>
</form>






</body>
</html>