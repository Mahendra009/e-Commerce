<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
      <div class="container-fluid">
        <a class="navbar-brand" href="${pageContext.request.contextPath}/home"><i class="fab fa-etsy"></i>veryNeed.in <i class="fas fa-shopping-bag"></i></a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
        <div>
				<form action="">
					<div class="input-group">
						<input type="text" class="form-control" size="70px"
							placeholder="Search Your Product Here" name="search">
						<div class="input-group-btn">
							<button class="btn btn-default" type="submit" style="background-color:#e91e63;">
								<i class="fas fa-search" style="font-size:22px;"></i>
							</button>
						</div>
					</div>
				</form>
			</div>
          <ul class="navbar-nav ml-5">
            <li class="nav-item active">
              <a class="nav-link" href="${pageContext.request.contextPath}/login">Login <i class="fas fa-sign-in-alt"></i></a>
            </li>
            <li class="nav-item active">
              <a class="nav-link" href="${pageContext.request.contextPath}/register">Signup <i class="fas fa-user-plus"></i></a>
            </li>
            <li class="nav-item active">
              <a class="nav-link" href="${pageContext.request.contextPath}/cart"><i class="fas fa-cart-plus"></i></a>
            </li>
            <li class="nav-item dropdown active">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          User
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="#"><i class="fas fa-users"></i> Profile</a>
          <a class="dropdown-item" href="${pageContext.request.contextPath}/checkOut"><i class="fab fa-first-order-alt"></i> Order Detail</a>
           <a class="dropdown-item" href="${pageContext.request.contextPath}/payment"><i class="fas fa-wallet"></i> Payment Detail</a>
          <a class="dropdown-item" href="${pageContext.request.contextPath}/perform_logout"><i class="fas fa-sign-out-alt"></i> Logout</a>
        </div>
      </li>
      <li class="nav-item dropdown active">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Admin
        </a>
        <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="${pageContext.request.contextPath}/category"><i class="fas fa-object-group"></i> Manage Category</a>
          <a class="dropdown-item" href="${pageContext.request.contextPath}/supplier"><i class="fas fa-building"></i> Manage Suppliers</a>
          <a class="dropdown-item" href="${pageContext.request.contextPath}/product"><i class="fab fa-product-hunt"></i> Manage Products</a>
          <a class="dropdown-item" href="${pageContext.request.contextPath}/displayProduct"><i class="fas fa-tv"></i> Display Products</a>
           <a class="dropdown-item" href="${pageContext.request.contextPath}/perform_logout"><i class="fas fa-sign-out-alt"></i> Logout</a>
        </div>
      </li>
          </ul>
        </div>
      </div>
    </nav>