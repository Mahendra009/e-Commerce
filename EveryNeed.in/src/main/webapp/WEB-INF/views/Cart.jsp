<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EveryNeed.in - Cart</title>
 <meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" href="resources/css/bootstrap.css">
 <link rel="stylesheet" href="resources/css/all.css">
 <link rel="stylesheet" href="resources/css/myApp.css">
 <style type="text/css">
 .footer {
  position: fixed;
  left: 0;
  bottom: 0;
  width: 100%;
}
 
 
 
 </style>
 
</head>
<body>
<%@ include file="shared/Header.jsp" %>
	<div class="container" style="margin-top: 100px;">
		<h3>Cart</h3>
	</div>
	


<div class="footer">
  		<%@ include file="shared/Footer.jsp" %>
 	</div>
	<script src="resources/js/jquery.js"></script>
	<script src="resources/js/popper.js"></script>
	<script src="resources/js/bootstrap.js"></script>
</body>
</html>