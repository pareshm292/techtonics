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
      <li ><a href="homepage.jsp"><span>Home</span></a></li>
      <li id="current"><a href="request.jsp"><span>Request</span></a></li>
		<li><a href="logout.jsp"><span>Logout</span></a></li>
    </ul>
  </div>

  </div>
  <br>
  <h3>Request for a TechTalk</h3>
    <form action="RequestForTalk">
      <p>
        <label>Name</label>
        <input name="name" value="Your Name" type="text" size="30" />
        <label>Title</label>
        <input name="talktitle" value="Topic for the Talk" type="text" size="30" />
        <label>Description</label>
        <textarea name="description" rows="5" cols="5"></textarea>
        <label>Date</label>
        <input name="date" type="date">
        <br />
        <input class="button" type="submit" />
      </p>
    </form>
    <br />
<div class="footer">
  <p> &copy; 2017 <strong>ATMECS Technologies</strong> &nbsp;&nbsp; Design by: <a href="http://www.styleshout.com/">Paresh</a> </p>
</div>
</body>
</html>
