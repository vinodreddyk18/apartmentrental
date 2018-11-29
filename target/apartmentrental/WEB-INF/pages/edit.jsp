<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Owner
  Date: 11/28/2018
  Time: 5:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

</html>
<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<head>
    <title>Login Page</title>
</head>
<body>

<div class="container">
    <h2>Simple Spring MVC flow</h2>
    <f:form class="form-inline" action="/apartmentRent/edit/${apartmentRent.id}.html" method="post" modelAttribute="apartmentRent">
        <div class="form-group">
            <label for="name">Name:</label>
            <f:input path="name" id="name"/><br>
        </div>
        <div class="form-group">
            <label for="location">Location:</label>
            <f:input path="location" id="location"/><br>
        </div>
        <button type="submit" class="btn btn-default">Submit</button>
    </f:form>
</div>
<div>
    <%-- <a href="${pageContext.request.contextPath}/team/list.html">Team List</a>--%>
    <a href="/location/list.html">Team List</a>
</div>

</body>
</html>