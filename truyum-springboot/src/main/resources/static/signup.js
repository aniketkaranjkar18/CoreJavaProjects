function validateSignup() {
    var a = document.forms["signupform"]["username"].value;
    var b = document.forms["signupform"]["firstname"].value;
    var c = document.forms["signupform"]["lastname"].value;
    var d = document.forms["signupform"]["password"].value;
    var e = document.forms["signupform"]["confirm-password"].value;

    if (a.length == 0){
       alert("Username cannot be empty");
    return false;
    }
    if (!isNaN(a)){
       alert("Username cannot contain Numbers");
    return false;
    }
    if (a.length <= 2 || a.length > 12){
       alert("Username should be in between 2 and 12 charachters");
    return false;
    }
    if (b.length == 0){
        alert("First-Name cannot be empty");
     return false;
     }
     if (!isNaN(b)){
        alert("First-Name cannot contain Numbers");
     return false;
     }
     if (b.length <= 2 || b.length > 12){
        alert("First-Name should be in between 2 and 12 charachters");
     return false;
     }
     if (c.length == 0){
        alert("Last-Name cannot be empty");
     return false;
     }
     if (!isNaN(c)){
        alert("Last-Name cannot contain Numbers");
     return false;
     }
     if (c.length <= 2 || c.length > 12){
        alert("Last-Name should be in between 2 and 12 charachters");
     return false;
     }
    if (d.length == 0){
        alert("Password cannot be empty");
    return false;
    }
    if (e.length == 0){
        alert("Confirm-password cannot be empty");
    return false;
    }
    if (d != e){
        alert("Password & Confirm-password do not match");
    return false;
    }
    return true;
}
