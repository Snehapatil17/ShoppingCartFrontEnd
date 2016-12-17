<!DOCTYPE html>
<html lang="en">
<head>
  <title>Beautiful You</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<style>

form{
	width: 50%;
    border: 2px solid black;
    padding-top: 8px;
    background-color: lightgreen;
}


.container {
    padding: 16px;
}


input[type=text], input[type=password] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid black;
    box-sizing: border-box;
}
</style>

<body>
<form class="col-md-offset-2 col-md-8">

<div class="container col-md-offset-2 col-md-8">

 	<label><b>Name</b></label>
    <input type="text" placeholder="Enter First Name" name="name" required>
    
    
    
 	<label><b>Email-ID</b></label>
    <input type="email" placeholder="Enter Email-ID" name="emailid" required>

    <label><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" required>
    
    <label><b>Confirm Password</b></label>
    <input type="password" placeholder="Enter Password" name="cpassword" required>
    
    <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">Submit</button>

</div>

<div class="container">
 

  <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Success!</h4>
        </div>
        <div class="modal-body">
          <p>Your data is added Successfully.</p>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>
  
</div>






</form>





</body>

</html>