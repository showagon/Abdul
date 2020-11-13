<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
  <style>
    .bg
    {
      background:url("yellow-bokeh-photo-949587.jpg") no-repeat;
      width: 100%;
      height: 100vh;
    }
  .main-css{
  width:400px; 
  background: #fff;
  margin:auto;  
  border-radius:10px;
  box-shadow:0px 0px 10px 0px;
  padding:30px;
  margin-top:15px;
  }
  </style>
</head>
<body class="bg">
<div class="container ">

<form action="SaveFlight" method="post" class="main-css">

<div class="form-group">
<label for="num">Flight Number</label>
<input name="flightnumber" id="num" class = "form-control">
</div>

<div class="form-group">
<label for="oa">OperatingAirlines</label>
<input name="operatingAirlines" id="oa" class = "form-control">
</div>

<div class="form-group">
<label for="oa">Departure City</label>
<input name="departureCity" id="oa" class = "form-control">
</div>

<div class="form-group">
<label for="ac">Arrival City</label>
<input name="arivalCity" id="ac" class = "form-control">
</div>

<div class="form-group">
<label for="dd">Departure Date</label>
<input type="date" name="dateOfDeparture" placeholder="dd-mm-yyyy" id="dd" class = "form-control" min="1997-01-01" max="2030-12-31">
</div>

<div class="form-group">
<label for="tt">Travel Time</label>
<input name="estimatedTravelTime111" placeholder="HH:mm:ss am/pm" id="tt" class = "form-control">
</div>


<div class="form-group">
<input type="submit" name="pwd" value="Save" class="btn btn-primary btn-block">
</div>


</form>
</div>
</body>
</html>