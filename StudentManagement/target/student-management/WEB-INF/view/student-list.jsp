<%--
  Created by IntelliJ IDEA.
  User: 15516
  Date: 9/20/2022
  Time: 10:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/URLToReachResourcesFolder/css/my-style-sheet.css">
</head>
<body class="myFont">
    <h1 align="center">Student Management(zhijie)</h1>

    <div class="container">
        <form action="${pageContext.request.contextPath}/showAddStudentPage">
            <input type="submit" value="ADD" class="btn btn-primary">
        </form>
        <br/>
    <table border="1" class="table table-success table-striped">
    <thead>
    <tr>
        <td>id</td>
        <td>name</td>
        <td>mobile</td>
        <td>country</td>
    </tr>
    </thead>
    <c:forEach var="student" items="${students}">
    <tr>
        <td>${student.id}</td>
        <td>${student.name}</td>
        <td>${student.mobile}</td>
        <td>${student.country}</td>
        <td><a href="${pageContext.request.contextPath}/updateStudent?userId=${student.id}">Update</a></td>
        <td><a href="${pageContext.request.contextPath}/deleteStudent?userId=${student.id}" onclick="if(!confirm('Are you sure you want to delete this student?')) return false">Delete</a></td>
    </tr>
    </c:forEach>
    </table>
        <img alt="photo" src="${pageContext.request.contextPath}/URLToReachResourcesFolder/images/faculty-essay.jpg">
    </div>
</body>
</html>
