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
<div class="container-fluid">

  <h1 class="my-4">${product.productName}
    <!-- <small>Secondary Text</small> -->
  </h1>

  <!-- Portfolio Item Row -->
  <div class="row">

    <div class="col-md-8">
      <img class="img-fluid" src="<c:url value="/resources/images/${product.productCode}.jpg"/>" alt="">
    </div>

    <div class="col-md-4">
      <table class="table table-dark table-hover" border="1">
		<div class="container">
			
			<tr>
				<td>Product code</td>
				<td>${product.productCode}</td>
			</tr>
			<tr>
				<td>Product Name</td>
				<td>${product.productName}</td>
			</tr>
			<tr>
				<td>Brand</td>
				<td>${product.brand}</td>
			</tr>
			<tr>
				<td>Price</td>
				<td>&#8377 ${product.unitPrice}</td>
			</tr>
			<tr>
				<td >Specifications</td>
				<td style="word-wrap:break-word;">${product.description}</td>
				
			</tr>
			<tr>
				<td>Supplier ID</td>
				<td>${product.supplierId}</td>
			</tr>
			<tr>
				<td>Stock Left</td>
				<td>${product.quantity}</td>
			</tr>
			<tr>
				<td>Category</td>
				<td>${categoryName}</td>
			</tr>
			
			<form action="<c:url value="/AddToCart/${product.productId}" />" method="get">
			<tr>
				<td>Quantity</td>
				<td>
					<select name="quantity" class="form-control btn-block">
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
					</select>
				</td>
			</tr>
			<tr>
				<td colspan="1">
					<input type="submit" value="Add To Cart" class="btn btn-info btn-block">
				</td>
				<td colspan="1">
					<input type="submit" value="Shop Now" class="btn btn-info btn-block">
				</td>
			</tr>
			</form>
			</div>
		</table>
    </div>

  </div>
  <!-- /.row -->

  <!-- Related Projects Row -->
  <h3 class="my-4">Related Products</h3>

  <div class="row">

    <div class="col-md-3 col-sm-6 mb-4">
      <a href="#">
            <img class="img-fluid" src="http://placehold.it/500x300" alt="">
          </a>
    </div>

    <div class="col-md-3 col-sm-6 mb-4">
      <a href="#">
            <img class="img-fluid" src="http://placehold.it/500x300" alt="">
          </a>
    </div>

    <div class="col-md-3 col-sm-6 mb-4">
      <a href="#">
            <img class="img-fluid" src="http://placehold.it/500x300" alt="">
          </a>
    </div>

    <div class="col-md-3 col-sm-6 mb-4">
      <a href="#">
            <img class="img-fluid" src="http://placehold.it/500x300" alt="">
          </a>
    </div>

  </div>
  <!-- /.row -->

</div>



	<script src="${pageContext.request.contextPath}/resources/js/jquery.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/popper.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>
</body>
</html>