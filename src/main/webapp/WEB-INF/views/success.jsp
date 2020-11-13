<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>HI ${email}</h3>
<h1>Your Ticket is Confirmed</h1>
<h2>Thanks for visiting ..</h2>

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
</body>
</html>