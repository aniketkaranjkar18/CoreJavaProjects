
</html><%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>truYum-Edit</title>
    <link rel="stylesheet" type="text/css" href="cart.css">
    <script src='https://kit.fontawesome.com/a076d05399.js'></script>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
<header>
    <div id="header-container">
    <div class="head-1">
        <div class="Logo-main">
        <h2><i class='fas fa-hamburger'></i> truYum</h2>
        </div>
    </div>
    <div class="head-1">
        <div class="Logo-nav">
        <nav>
            <ul class="menu-1">
            <li><a href="userLogin">Menu-items</a></li>
            <li><a href="userCart">Cart</a></li>
            <li><a href="homepage">Logout</a></li>
            <li><i class='fas fa-user-alt'></i> Aniket</li>
          
            </ul>
        </nav>
        </div>
    </div>
    </div>
</header>
<section>
    <div id="mid-container">
    <form class="form-1">
     <p>Cart-Details</p>
     <table>
    <c:forEach items="${cartList}" var="item">
        <tr><td><p>${item.name}</p></td> <td><p>${item.price}</p></td>
        <td><p><a href="/removeFromCart?id=${item.id}" class="btn btn-warning">Delete</a></p></td></tr>
        </c:forEach>
        </table>
    </form>
    
     
</div>
</section>
<footer>
    <div id="footer-container">
    <p class="foot-1">Copyright 2020</p>  
    </div>
</footer>
