<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MY NEW INDEX PAGE</title>
</head>


<body>
 
 <h1>Beautiful You </h1>
 	
 	
 	
 

 
 New User <a href="login.jsp">Log In</a>
 
<c:if test="${isuserClickedlogin}">
	<jsp:include page="login.jsp"></jsp:include>
</c:if>

Exisiting User <a href="signin.jsp">Sign In</a>

<c:if test="${isuserClickedsignin }">

<jsp:include page="signin.jsp"></jsp:include>

</c:if>



</body>
</html>