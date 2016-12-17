<!DOCTYPE html>
<html lang="en">
<head>
  <title>Beautiful You</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
</head>

<style>
form {
	width: auto;
    border: 2px solid black;
   
    
}

input[type=text], input[type=password] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid black;
    box-sizing: border-box;
}

button {
    background-color: green;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: auto;
    
}

.cancelbtn {
    width: auto;
    padding: 10px 18px;
    background-color: red;
}

.container {
    padding: 16px;
}

span.psw {
    float: right;
    padding-top: 16px;
}


</style>
<body>



<form class="login" action="validate" method="POST" >
      <div class="container">
      <h3>New User?<a href="signin.jsp"> Register Here </a></h3>
      </div>

  <div class="container">
    <label><b>Username</b></label>
    <input type="text" placeholder="Enter User-ID" name="uid" required>

    <label><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" required>
        
    <button type="submit">Log In</button>
  
  </div>

  <div class="container" style="background-color:sky blue">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="passw">Forgot <a href="#">password?</a></span>
  </div>
</form>

</body>
</html>