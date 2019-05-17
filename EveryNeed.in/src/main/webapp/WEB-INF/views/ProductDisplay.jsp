<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EveryNeed.in - Products</title>
 <meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.css">
 <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/all.css">
 <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/myApp.css">

</head>
<body>
<%@ include file="shared/Header.jsp" %>

<div class="d-flex" id="wrapper"  style="margin-top: 50px;">
    <div class="bg-light border-right" id="sidebar-wrapper"  style="margin-top: 20px; width: 20%;">
      <div class="list-group list-group-flush">
        <a href="#" class="list-group-item list-group-item-action bg-primary  text-white">Dashboard</a>
        <a href="#" class="list-group-item list-group-item-action bg-primary  text-white">Shortcuts</a>
        <a href="#" class="list-group-item list-group-item-action bg-primary  text-white">Overview</a>
        <a href="#" class="list-group-item list-group-item-action bg-primary  text-white">Events</a>
        <a href="#" class="list-group-item list-group-item-action bg-primary  text-white">Profile</a>
        <a href="#" class="list-group-item list-group-item-action bg-primary  text-white">Status</a>
      </div>
    </div>

    <div id="page-content-wrapper">
      <div class="container-fluid" style="margin-top: 50px;">
       <div class="row text-center text-lg-center">
		<c:forEach items="${productList}" var="product">
 			<div class="col-lg-3 col-md-4 col-xs-6">
 				<div class="d-block mb-4 h-100" style="width: 18rem; height: 15rem;">
  					<img class="card-img-top img-fluid" src="<c:url value="/resources/images/${product.productCode}.jpg"/>" style="height: 150px;"  alt="Card image cap">
   					<span class="card-title">
   						<STRONG>${product.productName}</STRONG> <br/>
						<strong>&#8377 ${product.unitPrice} /-</strong> <br/>
					</span>
  			<div class="card-action">
   	 	<a href="<c:url value="/totalProductInfo/${product.productId}"/>" class="btn btn-primary">View</a>
     
     	<a href="<c:url value="/AddToCart/${product.productId}?quantity=1" />" class="btn btn-primary"><i class="fas fa-cart-plus"></i></a>
  </div>
</div>
</div>
</c:forEach>
</div>
      </div>
    </div>
  </div>



	<script src="${pageContext.request.contextPath}/resources/js/jquery.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/popper.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>
</body>
</html>