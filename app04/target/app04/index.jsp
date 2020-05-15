<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<div>
<a href="bank">test </a><br/>
<a href="bank/account/1003">1003 </a><br/>
<a href="bank/accounts">All Accounts</a><br/>
<form method="post">
	<pre>
AccNo	<input type="number" name="accNo" id="accNo"/>
AccName	<input type="text" name="accName" id="accName"/>
Balance	<input type="text" name="balance" id="balance"/>
	<input type="submit" value="Save"/>	
	</pre>
</form>
</div>
</body>
</html>