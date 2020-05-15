<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>

<head>
<title>Form</title>
<link rel="stylesheet" type="text/css" href="resources/form.css"/>
</head>

<body>
<form action="signup" method="post">
  <div class="container">
    <h1>Register</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>

    <label for="fname"><b>First Name</b></label>
    <input type="text" id="fname" name="fname">
    
    <label for="mname"><b>Middle Name</b></label>
    <input type="text" id="mname" name="mname">

    <label for="lname"><b>Last Name</b></label>
    <input type="text" id="lname" name="lname"><br>
    
    <label for="dob"><b>Date Of Birth</b></label>
    <input type="text" id="dob" name="dob"><br>

    <input type="radio" id="male" name="gender" value="male">
	<label for="male">Male</label>
	
	<input type="radio" id="female" name="gender" value="female">
	<label for="female">Female</label>
	
	<input type="radio" id="other" name="gender" value="other">
	<label for="other">Other</label>

    <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>
    <input type="submit" value="Register"/>
  </div>
</form>
</body>
</html>