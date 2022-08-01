<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>truYum-Signup</title>
<link rel="stylesheet" type="text/css" href="signup.css">
<script src='https://kit.fontawesome.com/a076d05399.js'></script>
    <script src="/signup.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
	<header>
		<div id="header-container">
			<div class="head-1">
				<h2>
					<i class='fas fa-hamburger'></i> truYum
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
	<section>
		<div id="mid-container">
			<form class="form-1" onsubmit="return validateSignup();"
				name="signupform" id="signupform" action="/login" method="POST">
				<p>Signup</p>
				<label class="label-1" for="username">Username</label><br> <input
					type="text" id="username" name="User" placeholder="Enter Username"><br>
				<label class="label-1" for="firstname">First Name</label> <label
					class="label-2" for="lastname">Last Name</label><br> <input
					type="text" id="firstname" name="firstname"
					placeholder="Enter First Name"> <input type="text"
					id="lastname" name="lastname" placeholder="Enter Last Name"><br>
				<label class="label-1" for="password">Password</label> <label
					class="label-2" for="confirm-password">&nbsp; Confirm
					Password</label><br> <input type="text" id="password" name="password"
					placeholder="Enter Password"> <input type="text"
					id="confirm-password" name="confirm-password"
					placeholder="Confirm Password"> <input type="submit"
					value="Signup" class="BTN1">
			</form>
		</div>
	</section>
	<footer>
		<div id="footer-container">
			<p class="foot-1">Copyright 2020</p>
		</div>
	</footer>
</body>
</html>