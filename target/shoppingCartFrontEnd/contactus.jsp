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

.container{
		
			border: 2px solid black;
			background-color: #36B7B7;

}

button{
	
		margin-bottom : 8px 0;

}

input[type=text], input[type=email]
{

	 border: 1px solid black;
    box-sizing: border-box;
}


</style>




 <body>


<div id="contact" class="container" >
  <h3 class="text-center">Contact</h3>
  <p class="text-center"><em>We Deliver happiness!</em></p>

  <div class="row">
    <div class="col-md-4">
      <p>Fun at Shopping?? Drop a note.</p>
     
      <p><span class="glyphicon glyphicon-phone"></span>Phone: +91 9922114456</p>
      <p><span class="glyphicon glyphicon-envelope"></span>Email: www.beautifulyou.com</p>
    </div>
    <div class="col-md-8">
      <div class="row">
        <div class="col-sm-6 form-group">
          <input class="form-control" id="name" name="name" placeholder="Name" type="text" required>
        </div>
        <div class="col-sm-6 form-group">
          <input class="form-control" id="email" name="email" placeholder="Email" type="email" required>
        </div>
      </div>
      <textarea class="form-control" id="comments" name="comments" placeholder="Comment" rows="5"></textarea>
      <br>
      <div class="row">
        <div class="col-md-12 form-group">
          <button class="btn pull-right" type="submit">Send</button>
        </div>
      </div>
    </div>
  </div>
  
  
  <div class="row">
  <div class="col-md-12 from-group">
  
   <a href="index.jsp" > <button type="button" class="btn btn-default">Continue To Shopping</button></a>
   
  </div>
  </div>
  </div>

  
  </body>
  </html>