<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>truYum-Login</title>
    <link rel="stylesheet" href="login.css" type="text/css">
    <script src='https://kit.fontawesome.com/a076d05399.js'></script>
    <script src="login.js"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
    <header>
        <div id="header-container">
        <div class="head-1">
            <h2><i class='fas fa-hamburger'></i> truYum</h2>
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
    <section >
        <div id="mid-container">
            <form class="form-1" name="loginForm" id="loginForm"  method="POST" onsubmit="return validateLogin();" action="">
                <p>Login</p>
                <label class="label-1" for="username">Username</label>
                <input type="text" id="username" name="username" placeholder="Enter Username">
                <p id="error1"></p>
                <label class="label-1" for="password">Password</label>
                <input type="text" id="password" name="password" placeholder="Enter Password">
                <p id="error2"></p>
                <input type="submit" value="Login" class="BTN1">
                <p1>New here? <a href="/signup">&nbsp Signup</a></p1>
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