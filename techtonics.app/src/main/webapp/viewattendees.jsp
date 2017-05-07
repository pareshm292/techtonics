<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<head>
<title>TechTonics</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<link rel="stylesheet" href="images/Underground.css" type="text/css" />
</head>
<body>
<div id="wrap">
  <div id="header"> <span id="slogan">TechTonics</span>
    <ul>
      <li id="current"><a href="adminhomepage.jsp"><span>Home</span></a></li>
      <li><a href="approverequest.jsp"><span>Requests</span></a></li>
		<li><a href="logout.jsp"><span>Logout</span></a></li>
    </ul>
  </div>
  </div>
  <br>
  <div id="talktable" class="col-md-6">
  <table class="table table-condensed">
    <thead>
      <tr >
        <th>Email</th>
      </tr>
    </thead>
    <tbody>
<c:forEach items="${listOfAttendees}" var="emp">
	
	<tr>
    <td><p>${emp}</p></td>
    </tr>
    
</c:forEach>
</tbody>
</table>
</div>
    <br />
<div class="footer">
  <p> &copy; 2017 <strong>ATMECS Technologies</strong> &nbsp;&nbsp; Design by: <a href="http://www.styleshout.com/">Paresh</a> </p>
</div>
</body>
</html>
