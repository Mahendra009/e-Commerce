<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EveryNeed.in - Category</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.css">
 <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/all.css">
 <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/myApp.css">
</head>
<body>

<%@ include file="shared/Header.jsp" %>
<c:if test="${flag}">
<div class="container-fluid" style="margin-top: 50px;">
    <div class="row">
      <div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
        <div class="card card-signin my-5">
          <div class="card-body bg-danger">
            <h5 class="card-title text-center">Manage Category</h5>
            <form action="<c:url value="/updateCategory"/>" method="post" class="container-fluid form-horizontal form-group">
           	 	<div class="table-responsive">
					<table class="table table-hover table-dark" >
					<tr>
						<td>Category ID</td>
						<td><input class="form-control" type="text" name="categoryId" value="${categoryData.categoryId}" readonly></td>
					</tr>
						<tr>
							<td>Category Name</td>
							<td><input type="text" class="form-control" name="categoryName" value="${categoryData.categoryName}"></td>
						</tr>
						<tr>
							<td>Category Description</td>
							<td><textarea rows="4" cols="" class="form-control" name="description" value="${categoryData.description}"></textarea></td>
						</tr>
						<tr>
							<td colspan="2" style="text-align: center;">
							<input type="submit" value="Update" class="btn btn-primary"> 
							</td>
						</tr>
		</table>
		</div>
	</form>
          </div>
        </div>
      </div>
    </div>
  </div>
</c:if>



<c:if test="${!flag}">
<div class="container-fluid" style="margin-top: 50px;">
    <div class="row">
      <div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
        <div class="card card-signin my-5">
          <div class="card-body bg-danger">
            <h5 class="card-title text-center">Manage Category</h5>
            <form action="<c:url value="/saveCategory"/>" method="post" class="container-fluid form-horizontal form-group">
           	 	<div class="table-responsive">
					<table class="table  table-dark" >
						<tr>
							<td>Category Name</td>
							<td><input class="form-control" type="text" name="categoryName"></td>
						</tr>
						
						<tr>
							<td>Category Description</td>
							<td><textarea class="form-control" rows="4" cols="" name="description"></textarea></td>
						</tr>
						<tr>
							<td colspan="2" style="text-align: center;">
							<input type="submit" value="Submit" class="btn btn-primary">
							</td>
						</tr>
				</table>
		</div>
	</form>
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
            			<th>Category ID</th>
            			<th>Category Name</th>
            			<th>Category Description</th>
            			<td>Action</td>
            		</tr>
            	</thead>
            	<tbody>
            		<c:forEach items="${categoryList}" var="category">
            		<tr>
            			<td>${category.categoryId}</td>
						<td>${category.categoryName}</td>
						<td>${category.description}</td>
						
			<td>
				<a href="<c:url value='/deleteCategory/${category.categoryId}'/>"><i class="fas fa-trash-alt"></i></a>
				<a href="<c:url value='/editCategory/${category.categoryId}'/>"><i class="fas fa-pen-square"></i></a>
			</td>
            		</tr>
            		</c:forEach>
            	</tbody>
            		
            </table>
          </div>
        </div>
      </div>
    </div>
</c:if>
  	<script src="${pageContext.request.contextPath}/resources/js/jquery.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/popper.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>
</body>
</html>