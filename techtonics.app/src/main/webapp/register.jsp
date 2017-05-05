<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <link rel="stylesheet" href="css/style.css">
 
<html >
<head>
  <meta charset="UTF-8">
  <title>Registration Form</title>
  
</head>

<body>
	
  <div class="main-wrap">
        <div class="login-main">
        <form action="RegisterServlet" method="post" >
        	
            <input type="text" name="email" placeholder="Email" class="box1 border1" >
            <input type="text" name="name" placeholder="Name" class="box1 border1" >
            <input type="password" name="password" placeholder="Password" class="box1 border2">
            <input type="submit" class="send" value="Go">
          </form>      
        </div>      
    </div>
  
</body>
</html>