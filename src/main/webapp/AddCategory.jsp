<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">

<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 </head>
<style>
table, th , td{
border: 2px solid black;
border-collapes: collapse;
}
th, td{
	padding: 5px;
}
</style>
<body>
<h2>Add A Category</h2>
<div class="container">
  <form:form action="manage_add" method="post" modelAttribute="category">
    <div class="form-group">
      <label for="Enter Category ID">ID:</label>
      <form:input path="id" type="text" class="form-control" id="categ" placeholder="Enter ID"/>
    </div>
    <div class="form-group">
      <label for="Enter Category Name">Name:</label>
      <form:input path="name" type="text" class="form-control" id="pwd" placeholder="Enter Name"/>
    </div>
    
    <input type="submit" class="btn btn-default" value="Save">
  </form:form>




<div class="container col-md-8">

<h3>Category List</h3>

<h1 style="backgroud-color: #c4e17f; border-radius: 5px; height: 5px"></h1>

<table style="width: 100%; border-spacing: 25px; border: 2px">
<tr style="height:50px; color: green">
<th><h3><strong>Category Id</strong></h3></th>
<th><h3><strong>Category Name</strong></h3></th>
</tr>

<c:forEach items="${categoryList}" var="category" >
<c:url var="modifycategory" value="id=${category.id}"></c:url>
<tr style="height: 30px">
<td>${category.id}</td>
<td>${category.name}</td>
<td><a href="manage_category_update?id=${category.id}">Modify</a></td>
<td><a href="manage_category_remove">Delete</a></td>
</tr>
</c:forEach>
</table>

</div>
</body>
</html>