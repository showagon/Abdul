<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flight List</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">




<h3>Hi ${email}</h3>
<h1>Flight List</h1>
<table class="table table-striped">
  <tr>
    <th>Flight Number</th>
    <th>Airline Name</th> 
    <th>Departure City</th>
    <th>Arrival City</th>
    <th>Departure Date</th>
    <th>Travel Time</th>
    <th>Action</th>
  </tr>
  <c:forEach var="tempflight" items="${flightdetails}">
  <c:url var="updateLink" value="fcart">
     <c:param name="id" value="${tempflight.ID}"/>
  </c:url>
  
  <tr>
   
    <td>${tempflight.flightnumber}</td> 
    <td>${tempflight.operatingAirlines}</td>
    <td>${tempflight.departureCity}</td>
    <td>${tempflight.arivalCity}</td>
    <td>${tempflight.dateOfDeparture}</td>
    <td>${tempflight.estimatedTravelTime}</td>
    <td><a href="${updateLink}">Select</a></td>
  </tr>
  </c:forEach>
  
</table>
</div>
</body>
</html>