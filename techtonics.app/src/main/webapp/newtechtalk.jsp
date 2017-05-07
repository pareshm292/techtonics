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
  <h1><a href="index.html">Company logo</a></h1>
  <ul>
    <li><a href="adminhomepage.jsp">Home</a></li>
    <li><a href="approverequest.jsp">Request</a></li>
	<li><a href="newtechtalk.jsp">New Tech Talk</a></li>
	<li><a href="logout.jsp">Logout</a></li>
	
  </ul>
</div>
<!-- //#header -->
<!-- //#sub-header -->

<div id="content" class="clearfix">
  <div id="content-inner">
    <div class="column sidebar" style="float: none;">
<br>
  <h3 id="touch">Scheduke a TechTalk</h3>
    <form action="AddNewTalk" method="post">
      <fieldset>
      <ul>
      <li>
        <label>Name</label>
        <input name="name" value="Presenter's Name" type="text"  class="text"/>
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
  <p>Website designed by: <a href="https://github.com/pareshm292">Paresh</a>, Code: <a href="https://github.com/pareshm292/techtonics">Repository</a></p>
</div>
<!-- //#footer -->

</body>
</html>
