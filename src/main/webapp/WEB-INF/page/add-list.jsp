<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="module/bootstrap.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Create New Record</h1>

<%--@elvariable id="userAttribute" type="com.example.VesSpringVes.entity.UsersEntity"--%>
<c:url var="saveUrl" value="/add" />
<form:form action="${saveUrl}" method="post" modelAttribute="userAttribute">

	<div class="form-group">
		<label>Enter Name</label>
		<form:input path="name" class="form-control w-25"/>
	</div>
	<div class="form-group">
		<label>Enter Surename</label>
		<form:input path="secondname" class="form-control w-25"/>
	</div>
	<div class="form-group">
		<label>Enter Lastname</label>
		<form:input path="lastname" class="form-control w-25"/>
	</div>

	<input type="submit" class="btn btn-primary"/>
</form:form>


</body>
</html>