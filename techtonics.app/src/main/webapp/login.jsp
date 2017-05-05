<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html >
<head>
  <meta charset="UTF-8">
  <title>Login Form</title>
  
  
  
      <link rel="stylesheet" href="css/style.css">

  
</head>

<body>
	
  <div class="main-wrap">
        <div class="login-main">
        <form action="LoginServlet" method="post" >
            <input type="text" name="email" placeholder="Email" class="box1 border1" id>
            <input type="password" name="password" placeholder="password" class="box1 border2">
            <input type="submit" class="send" value="Go">
          </form>      
        </div>
        
    </div>
  
  
</body>
</html>