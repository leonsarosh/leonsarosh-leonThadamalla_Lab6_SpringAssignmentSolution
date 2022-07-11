<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><%@ taglib
	uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">
<title>Student Form for ${mode}</title>
</head>
<body>
	<div class="container">
		<h3>Student Form for ${mode}</h3>
		<hr>
		<p class="h4 mb-4">Enter Student</p>
		<form action="/student/save" method="POST">
			<!-- Add hidden form field to handle update -->
			<input type="hidden" name="id" value="${student.id}" />
			<div class="form-inline">
				<input type="text" name="first_name" value="${student.firstName}"
					class="form-control mb-4 col-4" placeholder="First Name">
			</div>
			<div class="form-inline">
				<input type="text" name="last_name" value="${student.lastName}"
					class="form-control mb-4 col-4" placeholder="Last Name">
			</div>
			<div class="form-inline">
				<input type="text" name="course" value="${student.course}"
					class="form-control mb-4 col-4" placeholder="Course">
			</div>
			<div class="form-inline">
				<input type="text" name="country" value="${student.country}"
					class="form-control mb-4 col-4" placeholder="Country">
			</div>
		
			<button type="submit" class="btn btn-info col-2">Save</button>
		</form>
		<hr>
		<a href="list">Back to Students List</a>
	</div>
</body>
</html>