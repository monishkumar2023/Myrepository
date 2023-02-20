<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Products</title>
</head>
<style>
body{
margin:10;
padding100;
background-image:url(uniq.jpg);
}
.container{
top:50%;
left:50%;
position:absolute;
transform:translate(-50%,-50%);
}
.card{
padding:90px 100px 100px 90px;
background-color:pink;
border-radius:10px;
}
#A{
border:none;
background:transparent;
border-bottom:10px solid:red;
padding:6px;
margin-bottom:30px;
color:white;
}
#button{
border-radius:15px;
padding:10px 20px;
background-color:green;
color:white;
margin-top:20px;
border:none;
outline:none;
margin-left:50px;
}
#a{
font-size:15px;
}
img{
border-radius:50px;
position:absolute;
margin-left:150px;
margin-top:-50px;
}
</style>
</head>
<body>
<form action="task.html">
<div class="container">
<div class="card">
<U><input type="text" name="n1" placeholder="Username" id="A"></U></br>
<input type="password" name="n2" placeholder="Password" id="A"></br>
<a href="file:///D:/html%20tests/forget.html" name="n3">forgot password?</a></br>
<a href="file:///D:/html%20tests/forget.html" name="n3">New User ?</a></br>
<input type="submit" name="n4" value="submit" id="button">
</div>
</div>
</form>
</body>
</html>