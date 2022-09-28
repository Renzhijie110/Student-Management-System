<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: 15516
  Date: 9/21/2022
  Time: 1:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/URLToReachResourcesFolder/css/my-style-sheet.css">
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/URLToReachResourcesFolder/css/add-student.css">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
</head>

<body>
<h1 align="center">Add Student</h1>
<div class="container" >

  <%--@elvariable id="student" type="java"--%>
  <form:form action="save-student" modelAttribute="student" method="post">
    <form:input type="hidden" path="id"></form:input>
    <label>Name: </label>
    <form:input path="name"></form:input>
    <br/>
    <label>Mobile: </label>
    <form:input path="mobile"></form:input>
    <br/>
    <label>Country: </label>
    <form:input path="country"></form:input>
    <br/>
    <input type="submit" value="Submit" >
  </form:form>
</div>

</body>
</html>
