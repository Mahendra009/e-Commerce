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
          <div class="card-body">
            <h5 class="card-title text-center">Manage Products</h5>
			<form:form action="${pageContext.request.contextPath}/saveProducts" modelAttribute="product" method="post" enctype="multipart/form-data" class="container-fluid form-horizontal form-group">
				<div class="form-label-group">
            		<form:label path="">Product Name</form:label>
               		<form:input path="productName" cssClass="form-control"/>
               		<form:errors path="productName" cssClass="help-block" element="em"/>
            	</div>
            	<div class="form-label-group">
            		<form:label path="">Brand</form:label>
               		<form:input path="brand" cssClass="form-control"/>
               		<form:errors path="brand" cssClass="help-block" element="em"/>
            	</div>
            	<div class="form-label-group">
            		<form:label path="">Quantity</form:label>
               		<form:input path="quantity" cssClass="form-control"/>
               		<form:errors path="quantity" cssClass="help-block" element="em"/>
            	</div>
            	<div class="form-label-group">
            		<form:label path="">Price</form:label>
               		<form:input path="unitPrice" cssClass="form-control"/>
               		<form:errors path="unitPrice" cssClass="help-block" element="em"/>
            	</div>
            	<div class="form-label-group">
            		<form:label path="">Category</form:label>
               		<form:select cssClass="form-control" path="categoryId">
					<form:option cssClass="form-control" value="0" label="--Select List--"/>
					<form:options cssClass="form-control" items="${categoryList}"/>
					</form:select>
            	</div>
            	<div class="form-label-group">
            		<form:label path="">Supplier</form:label>
               		<form:select cssClass="form-control" path="supplierId">
					<form:option cssClass="form-control" value="0" label="--Select List--"></form:option>
					<form:options cssClass="form-control" items="${supplierList}" />
					</form:select>
            	</div>
            	<div class="form-label-group">
            		<form:label path="">Ratings</form:label>
               		<form:input path="rating" cssClass="form-control"/>
               		<form:errors path="rating" cssClass="help-block" element="em"/>
            	</div>
            	<div class="form-label-group">
            		<form:label path="">Description</form:label>
               		<form:textarea rows="4" cols="" path="description" cssClass="form-control"/>
               		<form:errors path="description" cssClass="help-block" element="em"/>
            	</div>
            	<div class="form-label-group">
            		<form:label path="">Select Image</form:label >
               		<form:input type="file" path="file" />
            	</div>
            	<hr class="my-4">
            <button class="btn btn-md btn-primary btn-block text-uppercase" type="submit">Save</button>
			</form:form>
		</div>
		</div>
		</div>
		</div>
	</div>
	
	
    
          <div class="table-responsive-xl">
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
        
      
	


	<script src="resources/js/jquery.js"></script>
	<script src="resources/js/popper.js"></script>
	<script src="resources/js/bootstrap.js"></script>
</body>
</html>