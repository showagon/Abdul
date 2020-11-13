<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Hi ${email}</h3>
<h1>Search Flight</h1>
<form action="flightResult" method="post">
<table>
<tr>
<td>From</td>
<td><input type="text" name="from"></td>
</tr>
<tr>
<td>To</td>
<td><input type="text" name="to"></td>
</tr>
<tr>
<td>Departure Date</td>
<td><input type="text" name="departureDate"></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Search"></td>
</tr>

</table>

</form>
</body>
</html>