<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark" id="menuNavbar">
      <div class="container-fluid">
          <ul class="navbar-nav">
            <li class="nav-item dropdown active">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Shop Here
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
        	<c:forEach items="${listCategories}" var="category">
          		<a class="dropdown-item" href="#">${category.categoryName}</a>
         	</c:forEach>
        </div>
      </li>
            
          </ul>
        </div>
     
    </nav>