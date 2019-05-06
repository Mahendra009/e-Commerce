<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EveryNeed.in - Product</title>
 <meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" href="resources/css/bootstrap.css">
 <link rel="stylesheet" href="resources/css/all.css">
 <link rel="stylesheet" href="resources/css/myApp.css">
</head>
<body>
<%@ include file="shared/Header.jsp" %>
	<div class="container" style="margin-top: 50px;">
	<div class="row">
      <div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
        <div class="card card-signin my-5">
          <div class="card-body bg-danger">
            <h5 class="card-title text-center">Manage Products</h5>
			<form:form action="productInsurt" modelAttribute="product" method="post" class="container-fluid form-horizontal form-group">
				<div class="table-responsive">
					<table class="table table-hover table-dark">
						<tr>
							<td>Product Name</td>
							<td><form:input cssClass="form-control" path="productName"/></td>
						</tr>
						<tr>
							<td>Brand</td>
							<td><form:input cssClass="form-control" path="brand"/></td>
						</tr>
						<tr>
							<td>Quantity</td>
							<td><form:input cssClass="form-control" path="quantity"/></td>
						</tr>
						<tr>
							<td>Price</td>
							<td><form:input cssClass="form-control" path="unitPrice"/></td>
						</tr>
						<tr>
							<td>Category</td>
							<td><form:input cssClass="form-control" path="categoryId"/></td>
						</tr>
						<tr>
							<td>Supplier</td>
							<td><form:input cssClass="form-control" path="supplierId"/></td>
						</tr>
						<tr>
							<td>Rating</td>
							<td><form:input cssClass="form-control" path="rating"/></td>
						</tr>
						<tr>
							<td>Description</td>
							<td><form:textarea rows="4" cols="" class="form-control" path="description"/></td>
						</tr>
						<tr>
							<td colspan="2" style="text-align: center;">
							<input type="submit" value="Submit" class="btn btn-primary">
							</td>
						</tr>
						
					</table>
				</div>
			</form:form>
		</div>
		</div>
		</div>
		</div>
	</div>


	<script src="resources/js/jquery.js"></script>
	<script src="resources/js/popper.js"></script>
	<script src="resources/js/bootstrap.js"></script>
</body>
</html>