<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>fcart</title>
</head>
<body>
<h3>Hi ${email}</h3>
<h1>Your Cart Information</h1>
<h3>Please Review your Ticket</h3>
<table>
<tr>
<td>Flight Number</td>
<td>${flight.flightnumber}</td>
</tr>
<tr>
<td>Flight Name</td>
<td>${flight.operatingAirlines}</td>
</tr>
<tr>
<td>Start From</td>
<td>${flight.departureCity}</td>
</tr>
<tr>
<td>Destination</td>
<td>${flight.arivalCity}</td>
</tr>
<tr>
<td>Date</td>
<td>${flight.dateOfDeparture}</td>
</tr>
<tr>
<td>Time</td>
<td>${flight.estimatedTravelTime}</td>
</tr>
</table>

<br>
<form action="confirm" method="get">
<input type="submit" value="Book Now">
</form>



</body>
</html>