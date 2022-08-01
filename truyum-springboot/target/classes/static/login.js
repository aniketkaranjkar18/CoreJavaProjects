function validateLogin() {
    var x = document.forms["loginForm"]["username"].value;
    var y = document.forms["loginForm"]["password"].value;

    if (x.length == 0){
        document.getElementById("error1").innerHTML="Username cannot be empty";
    return false;
    }
    if (!isNaN(x)){
        document.getElementById("error1").innerHTML="Username cannot contain Numbers";
    return false;
    }
    if (x.length <= 2 || x.length > 12){
        document.getElementById("error1").innerHTML="Username should be in between 2 and 12 charachters";
    return false;
    }
    if (y.length == 0){
        document.getElementById("error2").innerHTML="Password cannot be empty";
    return false;
    }
    if(x == "user" && y == "user") {
    alert("You are Loging in as User 'Aniket Karanjkar'");
    document.forms["loginForm"].action = "/userLogin"
    return true;
    }
      if(x == "admin" && y == "admin") {
    alert("You are Loging in as Admin");
    document.forms["loginForm"].action = "/adminLogin"
    return true;
    }
    else alert("Incorrect Username Or Password")
    return false;
    }