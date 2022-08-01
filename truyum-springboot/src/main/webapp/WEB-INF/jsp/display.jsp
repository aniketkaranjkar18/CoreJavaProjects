<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<!DOCTYPE html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"rel="stylesheet"integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"crossorigin="anonymous">
</head>
<body>
        <nav  class="navbar navbar-expand-lg navbar-light bg-secondary text-white justify-content-end">
          <div class="container-fluid justify-content-end">
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown">
    <span class="navbar-toggler-icon"></span>
  </button>
       <div  class="collapse navbar-collapse justify-content-end" id="navbarNavDropdown">
            <ul class="nav navbar-nav">
            <li class="nav-item"><a class="nav-link text-white" href="adminLogin">Menu-items</a></li>
            <li class="nav-item"><a class="nav-link text-white" href="adminCart">Cart</a></li>
            <li class="nav-item"><a class="nav-link text-white" href="homepage">Logout</a></li>
            </ul>
       </div>
       </div>
        </nav>
<div class="container mb-3">
<img class="container mx-auto my-auto img-fluid" src="https://images.unsplash.com/photo-1476224203421-9ac39bcb3327?ixid=MXwxMjA3fDB8MHxzZWFyY2h8MTB8fGZvb2R8ZW58MHx8MHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60">
	</div>
	<h1
		class="text-center fs-1 text-decoration-underline bg-secondary text-white">
		Menu Items
		<h1>
			<div class="table-responsive">
				<table
					class="table table-striped table-hover table-bordered border-dark">

					<tr class=" table table-bordered table-primary border-secondary">
						<td><strong>Id</strong></td>
						<td><strong>Name</strong></td>
						<td><strong>Price</strong></td>
						<td><strong>Active</strong></td>
						<td><strong>DateOfLaunch</strong></td>
						<td><strong>Category</strong></td>
						<td><strong>Free Delivery</strong></td>
						<td><strong>Url</strong></td>
					</tr>
					<c:forEach items="${list}" var="menuItem">
						<tr>
							<td>${menuItem.id}</td>
							<td>${menuItem.name}</td>
							<td>${menuItem.price}</td>
							<td>${menuItem.active}</td>
							<td>${menuItem.dateOfLaunch}</td>
							<td>${menuItem.category}</td>
							<td>${menuItem.freeDelivery}</td>
							<td>${menuItem.url}</td>
						</tr>
					</c:forEach>
				</table>
			</div>
			<div>
				<div class="container">
					<h2
						class="text-center fs-1 text-decoration-underline bg-secondary text-white">My
						Form</h2>
					<form class="px-md-5 py-md-5 border border-dark">
						<div class="mb-3">
							<label class="fs-2" for="email">Email:</label> <input
								type="email" class="form-control" id="email">
						</div>
						<div class="mb-3">
							<label class="fs-2" for="password">Password:</label> <input
								type="password" class="form-control" id="password"
								placeholder="Enter password" name="pwd">
						</div>
						<button type="submit" class="btn btn-secondary">Submit</button>
					</form>
				</div>
			</div>
			<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
</body>

</html>
