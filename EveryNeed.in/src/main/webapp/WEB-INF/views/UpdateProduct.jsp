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
 <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.css">
 <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/all.css">
 <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/myApp.css">
</head>
<body>

<%@ include file="shared/Header.jsp" %>
	<div class="container" style="margin-top: 50px;">
	<div class="row">
      <div class="col-sm-9 col-md-9 col-lg-6 mx-auto">
        <div class="card card-signin my-5">
          <div class="card-body bg-danger">
            <h5 class="card-title text-center">Update Products</h5>
			<form:form action="${pageContext.request.contextPath}/updateProduct" modelAttribute="product" method="post" class="container-fluid form-horizontal form-group">
				<div class="table-responsive">
					<table class="table table-hover table-dark">
						<form:hidden path="productId" />
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
							<input type="submit" value="Update" class="btn btn-primary">
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





	<script src="${pageContext.request.contextPath}/resources/js/jquery.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/popper.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>
</body>
</html>