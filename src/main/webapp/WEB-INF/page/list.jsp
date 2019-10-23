<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@include file="module/bootstrap.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>List</title>
</head>
<body>
<c:url var="addUser" value="/"/>
<c:if test="${empty usersEntity}">
    <h2>No records found.</h2>
</c:if>

<p><a href="${addUser}">Create new record</a></p>


<div class="card-columns mx-4" style="min-width: 200px">
    <c:forEach var="user" items="${usersEntity}">
        <c:url var="editUser" value="/edit?id=${user.id}"/>
        <c:url var="deleteUser" value="/delete?id=${user.id}"/>
        <div class="card card-body border border-primary rounded-lg shadow p-3 mb-3 rounded ">

            <div class="d-flex bd-highlight">
                <h5 class="card-title p-2 w-100 bd-highlight"><code>Name: </code> ${user.name}</h5>
                <a href="${editUser}"
                   class="btn btn-primary float-right m-1 p-2 flex-shrink-1 bd-highlight align-self-baseline">Edit
                    User</a>
                <a href="${deleteUser}"
                   class="btn btn-primary float-right m-1 p-2 flex-shrink-1 bd-highlight align-self-baseline">Delete
                    User</a>
            </div>

            <p class="card-text"><code>Surname: </code> ${user.secondName}</p>
            <p class="card-text"><code>LastName: </code> ${user.lastName}</p>


            <c:if test="${!empty user.homeEntities}">

                <c:forEach var="home" items="${user.homeEntities}">
                    <c:url var="addHome" value="/addHome?id=${user.id}"/>
                    <c:url var="deleteHome" value="/deleteHome?id=${home.id}"/>
                    <c:url var="editHome" value="/editHome?uid=${user.id}&hid=${home.id}"/>

                    <div class="card-text" style="width: 18rem;">
                        <div class="card-header">
                            Adress
                        </div>
                        <ul class="list-group list-group-flush">
                            <li class="list-group-item">${home.city}</li>
                            <li class="list-group-item">${home.street}</li>
                            <li class="list-group-item">${home.type}</li>
                            <a href="${addHome}"
                               class="btn btn-primary float-right m-1 p-2 flex-shrink-1 bd-highlight align-self-baseline">Add
                                Home</a>
                            <a href="${editHome}"
                               class="btn btn-primary float-right m-1 p-2 flex-shrink-1 bd-highlight align-self-baseline">Edit
                                Home</a>
                            <a href="${deleteHome}"
                               class="btn btn-primary float-right m-1 p-2 flex-shrink-1 bd-highlight align-self-baseline">Delete
                                Home</a>
                        </ul>
                    </div>
                </c:forEach>
            </c:if>

            <c:if test="${empty user.homeEntities}">

                <div class="card" style="width: 18rem;">
                    <div class="card-header">
                        Adress
                    </div>
                    <ul class="list-group list-group-flush">
                        <li class="list-group-item">N/A</li>
                        <li class="list-group-item">N/A</li>
                        <li class="list-group-item">N/A</li>
                        <c:url var="addHome" value="/addHome?id=${user.id}"/>
                        <a href="${addHome}"
                           class="btn btn-primary float-right m-1 p-2 flex-shrink-1 bd-highlight align-self-baseline">Add
                            Home</a>
                    </ul>
                </div>

            </c:if>

        </div>

    </c:forEach>
</div>

</body>
</html>