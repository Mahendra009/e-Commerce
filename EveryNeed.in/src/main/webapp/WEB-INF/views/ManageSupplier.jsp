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
      <div class="col-sm-9 col-md-9 col-lg-6 mx-auto">
        <div class="card card-signin my-5">
          <div class="card-body bg-danger">
            <h5 class="card-title text-center">Manage Suppliers</h5>
			<form:form action="saveSupplier" modelAttribute="supplier" method="post" class="container-fluid form-horizontal form-group">
				<div class="table-responsive">
					<table class="table table-hover table-dark">
						<tr>
							<td>Supplier Name</td>
							<td><form:input cssClass="form-control" path="supplierName"/></td>
						</tr>
						<tr>
							<td>Firm Name</td>
							<td><form:input cssClass="form-control" path="firmName"/></td>
						</tr>
						<tr>
							<td>GSTN</td>
							<td><form:input cssClass="form-control" path="GSTIN"/></td>
						</tr>
						<tr>
							<td>Pan Card</td>
							<td><form:input cssClass="form-control" path="panCard"/></td>
						</tr>
						<tr>
							<td>Adhar Number</td>
							<td><form:input cssClass="form-control" path="adharCard"/></td>
						</tr>
						<tr>
							<td>Phone Number</td>
							<td><form:input cssClass="form-control" path="phoneNumber"/></td>
						</tr>
						<tr>
							<td>Email ID</td>
							<td><form:input cssClass="form-control" path="emailId"/></td>
						</tr>
						<tr>
							<td>Rating</td>
							<td><form:input cssClass="form-control" path="ratings"/></td>
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
        </div>
      </div>
      </div>


	<script src="resources/js/jquery.js"></script>
	<script src="resources/js/popper.js"></script>
	<script src="resources/js/bootstrap.js"></script>
</body>
</html>