<%@page import="com.mastek.app.model.BankAccount"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AccountDetails</title>
</head>
<body>
	<table>
		<c:forEach var="account" items="${accounts}">
			<tr>
				<td><a href="account/${account.getAccNo()}">${account.getAccNo()}</a></td>
				<td>${account.getAccName()}</td>
				<td>${account.getBalance()}</td>
			</tr>

		</c:forEach>
	</table>
</body>
</html>