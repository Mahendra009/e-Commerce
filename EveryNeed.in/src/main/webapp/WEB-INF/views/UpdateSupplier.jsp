<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EveryNeed.in - Supplier</title>
 <meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.css">
 <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/all.css">
 <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/myApp.css">
</head>
</head>
<body>
<%@ include file="shared/Header.jsp" %>
	<div class="container" style="margin-top: 50px;">
		<div class="row">
      <div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
        <div class="card card-signin my-5">
          <div class="card-body">
            <h5 class="card-title text-center">Update Suppliers</h5>
			<form:form action="${pageContext.request.contextPath}/updateSupplier" modelAttribute="supplier" method="post" class="container-fluid form-horizontal form-group">
				<form:hidden path="supplierId"/>
			<div class="form-label-group">
            		<form:label path="">Supplier Name</form:label>
               		<form:input path="supplierName" cssClass="form-control"/>
            </div>
            <div class="form-label-group">
            		<form:label path="">Firm Name</form:label>
               		<form:input path="firmName" cssClass="form-control"/>
            </div>
            <div class="form-label-group">
            		<form:label path="">GSTN Number</form:label>
               		<form:input path="GSTIN" cssClass="form-control"/>
            </div>
            <div class="form-label-group">
            		<form:label path="">PAN Card Number</form:label>
               		<form:input path="panCard" cssClass="form-control"/>
            </div>
            <div class="form-label-group">
            		<form:label path="">Adhar Card Number</form:label>
               		<form:input path="adharCard" cssClass="form-control"/>
            </div>
            <div class="form-label-group">
            		<form:label path="">Phone Number</form:label>
               		<form:input path="phoneNumber" cssClass="form-control"/>
            </div>
            <div class="form-label-group">
            		<form:label path="">Email ID</form:label>
               		<form:input path="emailId" cssClass="form-control"/>
            </div>
            <div class="form-label-group">
            		<form:label path="">Ratings</form:label>
               		<form:input path="ratings" cssClass="form-control"/>
            </div>
            <div class="form-label-group">
            		<form:label path="">Category</form:label>
               		<form:select cssClass="form-control" path="categoryId">
					<form:option cssClass="form-control" value="0" label="--Select List--"/>
					<form:options cssClass="form-control" items="${categoryList}"/>
					</form:select>
            </div>
            <hr class="my-4">
            <button class="btn btn-md btn-primary btn-block text-uppercase" type="submit">Update</button>
            
            
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