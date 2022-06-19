<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>
	<div class="container">
		<div class="jumbotron">
			<h1 class="display-4">Student Management App</h1>
			<p class="lead">This application will help us in adding
				/removing/modifying student data</p>

			</p>

			<form method="post" action="addStudent.do">
				Student Id <input type="text" name="studentId" /> Student Name <input
					type="text" name="studentName" /> Student Score <input type="text"
					name="studentScore" /> <input type="submit" value="Add Student">
			</form>

		</div>
		</body>
</html>