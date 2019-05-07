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
      <div class="col-sm-9 col-md-9 col-lg-6 mx-auto">
        <div class="card card-signin my-5">
          <div class="card-body bg-danger">
            <h5 class="card-title text-center">Manage Products</h5>
			<form:form action="saveProducts" modelAttribute="product" method="post" class="container-fluid form-horizontal form-group">
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
				<td>
					<form:select cssClass="form-control" path="categoryId">
					<form:option cssClass="form-control" value="0" label="--Select List--"/>
					<form:options cssClass="form-control" items="${categoryList}"/>
					</form:select>
				</td>
			</tr>
			<tr>
				<td>Supplier</td>
				<td><form:select cssClass="form-control" path="supplierId">
					<form:option cssClass="form-control" value="0" label="--Select List--"></form:option>
					<form:options cssClass="form-control" items="${supplierList}" />
				</form:select>
				</td>
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
	
	<div class="container-fluid">
    <div class="row">
    <div class="col-12 mx-auto">
          <div class="table-responsive">
            <table class="table table-bordered table-hover table-condensed table-dark">
            	<thead>
            		<tr>
            			<th>Product Code</th>
            			<th>Product ID</th>
            			<th>Product Name</th>
            			<th>Brand</th>
            			<th>Product Quantity</th>
            			<th>Price</th>
            			<th>Rating</th>
            			<th>Category</th>
            			<th>Supplier</th>
            			<th>Description</th>
            			<th>Action</th>
            		</tr>
            	</thead>
            	<tbody>
            		<c:forEach items="${productList}" var="product">
            		<tr>
            			<td>${product.productCode}</td>
						<td>${product.productId}</td>
						<td>${product.productName}</td>
						<td>${product.brand}</td>
						<td>${product.quantity}</td>
						<td>${product.unitPrice}</td>
						<td>${product.rating}</td>
						<td>${product.categoryId}</td>
						<td>${product.supplierId}</td>
						<td>${product.description}</td>
						
			<td>
				<a href="<c:url value='/deleteProduct/${product.productId}'/>"><i class="fas fa-trash-alt"></i></a>
				<a href="<c:url value='/editProduct/${product.productId}'/>"><i class="fas fa-pen-square"></i></a>
			</td>
            		</tr>
            		</c:forEach>
            	</tbody>
            		
            </table>
          </div>
        </div>
      </div>
      </div>
	


	<script src="resources/js/jquery.js"></script>
	<script src="resources/js/popper.js"></script>
	<script src="resources/js/bootstrap.js"></script>
</body>
</html>