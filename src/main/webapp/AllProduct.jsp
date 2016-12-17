<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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

<div class="container col-md-8">

<h3>Product List</h3>

<h1 style="backgroud-color: #c4e17f; border-radius: 5px; height: 5px"></h1>

<table style="width: 100%; border-spacing: 25px">
<tr style="height:50px; color: green">
<th><h4><strong>Product Id</strong></h4></th>
<th><h4><strong>Product Name</strong></h4></th>
<th><h4><strong>Product Price</strong></h4></th>
</tr>

<c:forEach items="${productList}" var="product" >
<c:url var="modifyproduct" value="id=${product.id}"></c:url>
<tr style="height: 30px">
<td>${product.id}</td>
<td>${product.name}</td>
<td>${product.price}</td>
<td><a href="ModifyProduct">Modify</a></td>
<td><a href="#">Delete</a></td>
</tr>
</c:forEach>
</table>

</div>

</body>
</html>