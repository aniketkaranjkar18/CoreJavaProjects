function validateEdit() {
    var a = document.forms["editForm"]["Item-Name"].value;
    var b = document.forms["editForm"]["price"].value;
    var c = document.forms["editForm"]["DateOfLaunch"].value;
    var d = document.forms["editForm"]["Category"].value;
    var e = document.forms["editForm"]["Delivery"].value;
   
    if (a.length == 0){
       document.getElementById("error1").innerHTML="Please Enter the Item Name"
     return false;
     }
     if (!isNaN(a)){
        alert("Item-Name cannot contain Numbers");
     return false;
     }
     if (a.length <= 2 || a.length > 12){
        alert("Item-Name should be in between 2 and 12 charachters");
     return false;
     }  if (b.length == 0){
        alert("Price cannot be empty");
     return false;
     }
     if (isNaN(b)){
        alert("Price should be a Number");
     return false;
     }
}
