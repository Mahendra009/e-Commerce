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
            <h5 class="card-title text-center">Manage Suppliers</h5>
			<form:form action="saveSupplier" modelAttribute="supplier" method="post" class="container-fluid form-horizontal form-group">
			<div class="form-label-group">
            		<form:label path="">Supplier Name</form:label>
               		<form:input path="supplierName" cssClass="form-control"/>
               		<form:errors path="supplierName" cssClass="help-block" element="em"/>
            </div>
            <div class="form-label-group">
            		<form:label path="">Firm Name</form:label>
               		<form:input path="firmName" cssClass="form-control"/>
               		<form:errors path="firmName" cssClass="help-block" element="em"/>
            </div>
            <div class="form-label-group">
            		<form:label path="">GSTN Number</form:label>
               		<form:input path="GSTIN" cssClass="form-control"/>
               		<form:errors path="firmName" cssClass="help-block" element="em"/>
            </div>
            <div class="form-label-group">
            		<form:label path="">PAN Card Number</form:label>
               		<form:input path="panCard" cssClass="form-control"/>
               		<form:errors path="panCard" cssClass="help-block" element="em"/>
            </div>
            <div class="form-label-group">
            		<form:label path="">Adhar Card Number</form:label>
               		<form:input path="adharCard" cssClass="form-control"/>
               		<form:errors path="adharCard" cssClass="help-block" element="em"/>
            </div>
            <div class="form-label-group">
            		<form:label path="">Phone Number</form:label>
               		<form:input path="phoneNumber" cssClass="form-control"/>
               		<form:errors path="phoneNumber" cssClass="help-block" element="em"/>
            </div>
            <div class="form-label-group">
            		<form:label path="">Email ID</form:label>
               		<form:input path="emailId" cssClass="form-control"/>
               		<form:errors path="emailId" cssClass="help-block" element="em"/>
            </div>
            <div class="form-label-group">
            		<form:label path="">Ratings</form:label>
               		<form:input path="ratings" cssClass="form-control"/>
               		<form:errors path="ratings" cssClass="help-block" element="em"/>
            </div>
            <div class="form-label-group">
            		<form:label path="">Category</form:label>
               		<form:select cssClass="form-control" path="categoryId">
					<form:option cssClass="form-control" value="0" label="--Select List--"/>
					<form:options cssClass="form-control" items="${categoryList}"/>
					</form:select>
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
            			<th>Supplier ID</th>
            			<th>Category ID</th>
            			<th>Supplier Code</th>
            			<th>Supplier Name</th>
            			<th>Firm Name</th>
            			<th>GSTN</th>
            			<th>PAN Card</th>
            			<th>Adhar Number</th>
            			<th>Phone Number</th>
            			<th>Email ID</th>
            			<th>Ratings</th>
            			<th>Action</th>
            		</tr>
            	</thead>
            	<tbody>
            		<c:forEach items="${supplierList}" var="supplier">
            		<tr>
            			<td>${supplier.supplierId}</td>
						<td>${supplier.categoryId}</td>
						<td>${supplier.supplierCode}</td>
						<td>${supplier.supplierName}</td>
						<td>${supplier.firmName}</td>
						<td>${supplier.GSTIN}</td>
						<td>${supplier.panCard}</td>
						<td>${supplier.adharCard}</td>
						<td>${supplier.phoneNumber}</td>
						<td>${supplier.emailId}</td>
						<td>${supplier.ratings}</td>
			<td>
				<a href="<c:url value='/deleteSupplier/${supplier.supplierId}'/>"><i class="fas fa-trash-alt"></i></a>
				<a href="<c:url value='/editSupplier/${supplier.supplierId}'/>"><i class="fas fa-pen-square"></i></a>
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