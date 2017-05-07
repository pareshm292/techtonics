<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>

<title>Techtonics</title>

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
    <li><a href="homepage.jsp">Home</a></li>
    <li><a href="request.jsp">Request</a></li>
	<li><a href="logout.jsp">Logout</a></li>
	
  </ul>
</div>
<!-- //#header -->
<!-- //#sub-header -->

<div id="content" class="clearfix">
  <div id="content-inner">
    <div class="column sidebar" style="float: none;">
<br>
  <h3 id="touch">Request for a TechTalk</h3>
    <form action="RequestForTalk" method="post">
      <fieldset>
      <ul>
      <li>
        <!-- <label>Name</label> -->
        <input name="name"  value="${user.empName }" type="hidden"  class="text"/>
       </li>
       <li> 
        <label>Title</label>
        <input name="talktitle" value="Topic for the Talk" type="text" class="text" />
        </li>
        <li>
        <label>Description</label>
        <textarea name="description" rows="5" cols="30"></textarea>
        </li>
        <li>
        <label>Date</label>
        <input name="date" type="date">
        </li>
        <input class="button" type="submit" />
	</ul>
    </fieldset>
    </form><!-- //#content -->

<div id="footer">
  <p>Website designed by: <a href="http://www.agilo.hr">Paresh</a>, Code: <a href="https://github.com/pareshm292/techtonics">Repository</a></p>
</div>
<!-- //#footer -->

</body>
</html>
