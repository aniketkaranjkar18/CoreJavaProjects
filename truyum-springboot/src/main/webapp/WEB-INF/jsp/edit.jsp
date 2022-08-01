<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>truYum-Edit</title>
    <link rel="stylesheet" type="text/css" href="edit.css">
    <script src='https://kit.fontawesome.com/a076d05399.js'></script>
    <script src="edit.js"></script>
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
            <li><a href="adminLogin">Menu-items</a></li>
            <li><a href="adminCart">Cart</a></li>
            <li><a href="homepage">Logout</a></li>
            <li><i class='fas fa-user-alt'></i> Admin</li>
            </ul>
        </nav>
        </div>
    </div>
    </div>
</header>
<section>
    <div id="mid-container">
    <form class="form-1" action="/editedSuccessfully" onsubmit="return validateEdit();" name="editForm" id="editForm">
        <p>Edit Menu Item</p>
         <label class="label-1" for="Item_Number">Item-Id</label>
         <input type="number" id="Item_Number" name="Item_Number"><br>
        <label class="label-1" for="Item_Name">Item-Name</label><br>
        <h4 id="error1"></h4>
        <input type="text" id="Item_Name" name="Item_Name"><br>
        <label class="label-1" for="price">Price</label>
        <label class="label-2" for="DateOfLaunch">&nbsp &nbsp &nbsp &nbsp &nbsp; Date Of Launch</label><br>
        <input type="number" id="price" name="price" placeholder="&#8377 00.00">
        <input type="date" id="DateOfLaunch" name="DateOfLaunch"><br>
        <label class="label-1" for="Category">Category</label>
        <label class="label-2" for="Category">&nbsp; Delivery-Option</label><br>
        <select id="Category" name="Category">
            <option>...Select</option>
            <option>Veg</option>
            <option>Non-Veg</option>
        </select>
        <input type="radio" id="Delivery" name="Delivery">Dine-In<input type="radio" id="Delivery" name="Delivery">Free
        <input type="submit" value="Save" class="BTN1" >
    </form>
</div>
</section>
<footer>
    <div id="footer-container">
    <p class="foot-1">Copyright 2020</p>  
    </div>
</footer>
</html>