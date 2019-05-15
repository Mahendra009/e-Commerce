<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
 <div class="container" style="margin-top: 50px;">
    <div class="row">
      <div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
        <div class="card card-signin my-5">
          <div class="card-body">
            <h5 class="card-title text-center">Update Category</h5>
            <form:form action="${pageContext.request.contextPath}/updateCategory" modelAttribute="category" method="post" class="form-signin">
            	<form:hidden path="categoryId"/>
            <div class="form-label-group">
            		<form:label path="">Category Name</form:label>
               		<form:input path="categoryName" cssClass="form-control"/>
            </div>
            <div class="form-label-group">
            		<form:label path="">Category Description</form:label>
               		<form:textarea rows="4" cols="" path="description" cssClass="form-control"/>
            </div>
            <hr class="my-4">
            <button class="btn btn-md btn-primary btn-block text-uppercase" type="submit">Save</button>
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