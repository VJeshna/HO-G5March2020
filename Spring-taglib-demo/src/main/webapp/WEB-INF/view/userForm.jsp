<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
</head>
<body>
<form:form method="POST" action="register">
    User Name <form:input path="name"/>
    Password  <form:password path="password"/>
    Gender    <form:radiobutton path="gender" value="M" label="M"/>
              <form:radiobutton path="gender" value="F" label="F"/>   
    Country   <form:select path="country">
                <form:option value="0" label="Select"></form:option>
                <form:option value="1" label="India"></form:option>
                <form:option value="2" label="UK"></form:option>
                <form:option value="3" label="US"></form:option>
            </form:select>
    <input type="submit" value="Register"/>
</form:form>
</body>
</html>
