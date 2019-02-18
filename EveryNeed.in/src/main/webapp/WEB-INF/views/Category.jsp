<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EveryNeed.in - Category</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" href="resources/css/bootstrap.css">
 <link rel="stylesheet" href="resources/css/all.css">
 <link rel="stylesheet" href="resources/css/myApp.css">
</head>
<body>

<%@ include file="shared/Header.jsp" %>
<div class="container-fluid" style="margin-top: 50px;">
    <div class="row">
      <div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
        <div class="card card-signin my-5">
          <div class="card-body">
            <h5 class="card-title text-center">Manage Category</h5>
            <form class="form-signin" action="" method="post">
              
              <div class="form-label-group">
               	<label for="inputCategoryId">Category ID</label>
                <input type="text" id="inputCategoryId" class="form-control" placeholder="Category ID">
              </div>

              <div class="form-label-group">
              	<label for="inputCategoryName">Category Name</label>
                <input type="text" id="inputCategoryName" class="form-control" placeholder="Category Name">
              </div>
              
              <div class="form-label-group">
              	<label for="inputCategoryDescription">Category Description</label>
                <textarea rows="5" cols="" id="inputCategoryDescription" class="form-control" placeholder="Category Description"></textarea>
              </div>
				<hr class="my-4">
              <button class="btn btn-lg btn-primary btn-block text-uppercase" type="submit" value="Submit">Submit</button>
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



  	<script src="resources/js/jquery.js"></script>
	<script src="resources/js/popper.js"></script>
	<script src="resources/js/bootstrap.js"></script>
</body>
</html>