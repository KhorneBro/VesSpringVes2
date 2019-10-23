<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@include file="module/bootstrap.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>

<h1>Edit Existing Record</h1>

<%--?id=${userAttribute.id}--%>

<%--@elvariable id="homeAttribute" type="com.example.VesSpringVes.entity.HomeEntity"--%>
<c:url var="saveUrl" value="/editHome?id=${homeAttribute.id}"/>
<form:form action="${saveUrl}" method="post" modelAttribute="homeAttribute">

    <div class="form-group">
        <label>City</label>
        <form:input path="city" class="form-control w-25"/>
    </div>
    <div class="form-group">
        <label>Street</label>
        <form:input path="street" class="form-control w-25"/>
    </div>
    <tr>
        <p><select name="type">
            <option value="APARTMENT">APARTMENT</option>
            <option selected value="PRIVATE_HOUSE">PRIVATE HOUSE</option>
        </select></p>
    </tr>

    <input type="submit" class="btn btn-primary"/>
</form:form>

</body>
</html>