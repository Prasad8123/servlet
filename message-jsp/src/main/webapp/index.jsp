<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Message-servlet</title>
</head>
<body leftmargin="500px" marginheight="120px" style='background-color:rgb(0,255,255)'>
<h1 style='color:red'>Sending Details of Favorite Persion</h1>
<form action="msg" method="post">
<pre>
First Name   <input type="text" name="fName"/>
</pre>
<pre>
Last Name    <input type="text" name="lName"/>
</pre>
<pre>
Gender  Male <input type="radio" name="gender" value="Male"/> Female <input type="radio" name="gender" value="Female"/>
</pre>
<pre>
Reason       <textarea rows="3" cols="15" name="reason"></textarea>
</pre>
<pre>
Address      <textarea rows="3" cols="15" name="address"></textarea>
</pre>
<pre>
<input type="submit" value="Send"/>
</pre>
</form>
</body>
</html>