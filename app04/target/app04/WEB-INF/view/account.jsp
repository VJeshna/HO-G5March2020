<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AccountDetails</title>
</head>
<body>
<table>
<tr>
<td>${account.getAccNo()}</td>
<td>${account.getAccName()}</td>
<td>${account.getBalance()}</td>
</tr>
</table>
</body>
</html>