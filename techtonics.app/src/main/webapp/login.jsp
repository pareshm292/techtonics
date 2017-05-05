<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <link rel="stylesheet" href="css/style.css">
 
<html >
<head>
  <meta charset="UTF-8">
  <title>Login Form</title>
  
</head>

<body>
	
  <div class="main-wrap">
  <a href="register.jsp" ><h4 align="left">Register</h4></a>
  <h3 align="center">${loginstatus}</h3>
        <div class="login-main">
        <form action="LoginServlet" method="post" >
        	
            <input type="text" name="email" placeholder="Email" class="box1 border1" >
            <input type="password" name="password" placeholder="password" class="box1 border2">
            <input type="submit" class="send" value="Go">
          </form>      
        </div>      
    </div>
  
</body>
</html>