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
  <h1><a href="login.jsp">Company logo</a></h1>
  <ul>
    <li><a href="login.jsp">Login</a></li>
	<li><a href="register.jsp">Register</a></li>
	
  </ul>
</div>
<!-- //#header -->
<!-- //#sub-header -->

<div id="content" class="clearfix">
  <div id="content-inner">
    <div class="column sidebar" style="float: none;">
    <p>${loginstatus }</p>
    
<br>
  
    <form action="LoginServlet" method="post">
      <fieldset>
      <ul>
      <li>
        <label>Email</label>
        <input name="email" value="email@atmecs.com" type="text"  class="text"/>
       </li>
       <li> 
        <label>Password</label>
        <input name="password" type="password"  class="password" />
        </li>
        <input class="button" type="submit" value="Submit" />
	</ul>
    </fieldset>
    </form><!-- //#content -->
</div>
</div>
</div>
<div id="footer">
  <p>Website designed by: <a href="https://github.com/pareshm292">Paresh</a>, Code: <a href="https://github.com/pareshm292/techtonics">Repository</a></p>
</div>
<!-- //#footer -->

</body>
</html>
