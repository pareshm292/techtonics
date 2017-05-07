<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>

<title>TechTonics</title>

<link type="text/css" media="screen" rel="stylesheet" href="stylesheets/reset.css" />
<link type="text/css" media="screen" rel="stylesheet" href="stylesheets/main.css" />

<!--[if IE 6]>
<script type="text/javascript" src="scripts/DD_belatedPNG_0.0.7a.js"></script> 
<script type="text/javascript" src="scripts/png_fix_elements.js"></script> 
<![endif]-->

</head>
<body>

<div id="header">
  <h1><a href="homepage.jsp">Company logo</a></h1>
  <div style="color: white">Welcome, ${user.empName }</div>
  <ul>
    <li><a href="adminhomepage.jsp">Home</a></li>
    <li><a href="#">Requests</a></li>
	<li><a href="newtechtalk.jsp">New Tech Talk</a></li>
	<li><a href="logout.jsp">Logout</a></li>
	</ul>
</div>
<!-- //#header -->
<!-- //#sub-header -->

<div id="content" class="clearfix">
  <div id="content-inner">
    <div class="column main">
    <table  style="size: 100px">
        <thead>
      <tr  style="size: 100px">
        <th  style="size: 100px">Attendees for ${talkTitle}</th>
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
      </form>
    </div>
  </div>
</div>
<!-- //#content -->

<div id="footer">
  <p>Website designed by: <a href="https://github.com/pareshm292">Paresh</a>, Code: <a href="https://github.com/pareshm292/techtonics">Repository</a></p>
</div>
<!-- //#footer -->

</body>
</html>
