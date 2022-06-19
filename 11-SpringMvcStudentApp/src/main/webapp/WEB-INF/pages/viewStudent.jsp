<%@page import="com.morningstar.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Students</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>Student Id</th>
			<th>Student Name</th>
			<th>Student Score</th>
		</tr>
		<c:forEach var="student" items="${ requestScope.studentList }">
			<tr>
				<td> <c:out value="${ student.studentId }"></c:out> </td>
				<td> <c:out value="${ student.studentName }"></c:out> </td>
				<td> <c:out value="${ student.studentScore }"></c:out> </td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
