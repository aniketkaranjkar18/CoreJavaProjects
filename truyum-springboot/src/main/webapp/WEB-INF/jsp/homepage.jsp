<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<title>truYum</title>
<link rel="stylesheet" href="homepage.css" type="text/css">
<script src='https://kit.fontawesome.com/a076d05399.js'></script>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</html>
<body>
	<header>
		<div id="header-container">
			<div class="head-1">
				<h2>
					<i class='fas fa-hamburger'></i>truYum
				</h2>
			</div>
			<div class="head-1">
				<nav>
					<ul class="menu-1">
						<li><a href="/homepage">Menu-items</a></li>
						<li><a href="/login">Login</a></li>
						<li><a href="/signup">Signup</a></li>
					</ul>
				</nav>
			</div>
		</div>
	</header>
	<div class="search-section">
		<div class="search-container">
			<div class="seach-bar">
				<p class="findfood">Find Food</p>
				<form>
					<p>
						<button>
							<i class='fas fa-coffee' style="font-size: 17px"></i>
						</button>
						<input type="text" placeholder="Search food">
					</p>
				</form>
			</div>
		</div>
	</div>
	<div class="order-list">
	<c:forEach items="${list}" var="menuItem">
		 <div class="pic-1">
		 <img src="${menuItem.url}" height="300px" width="400px">
              <div class="description">
                <div class="top">
                <div class="description-1">
                    <p>${menuItem.name}</p>
                    </div>
                   <div class="description-2">
                       <p>&#8377 ${menuItem.price}</p>
                    </div>
                </div>
                     <div class="bottom">
                   <div  class="description-3">
                      <p>${menuItem.category}</p>
                         </div>
                   <div  class="description-4">
                     <p>&nbsp &nbsp &nbsp;<i class='fas fa-truck'></i><span>FREE :${menuItem.freeDelivery}</span></p>
                         </div>   
                </div>     
            </div>
        </div>
		</c:forEach>
	</div>
	<footer>
		<div id="footer-container">
			<p class="foot-1">Copyright 2020</p>
		</div>
	</footer>
</body>
</html>