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
    <table>
            <thead>
      <tr >
        <th>Title</th>
        <th>Description</th>
        <th>Presenter</th>
        <th>Date</th>
      </tr>
    </thead>
    <tbody>
<c:forEach items="${listOfTechTalks}" var="techtalk">
	
	<tr>
	<form action="ViewAttendees" method="post">
    <td><p>${techtalk.talkTitle}</p></td>
    <td><p>${techtalk.talkPresenter}</p></td>
    <td><p>${techtalk.talkDescription}</p></td>
    <td><p>${techtalk.talkDate }</p></td>
    <input type="hidden" name="talkTitle" value="${techtalk.talkTitle }">
    <%-- <td><input type="hidden" name="email" value="${user.empEmail }"></td> --%>
    <td><input type="submit" value="View Attendees"></td>
    </form>
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
