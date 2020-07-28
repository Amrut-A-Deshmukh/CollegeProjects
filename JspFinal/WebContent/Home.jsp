<html>
	<head>
		<title>BESCOM</title>
		<link rel="stylesheet" type="text/css" href="style.css">
		<style>
			::placeholder 
			{
  				color: white;
			}
		</style>
	</head>
	<body>
		<nav>
			<img src="bescom.png" width="200" height="80">	
				<ul>
					<li><a href="index.html">Home</a></li>
					<li><a href="Home.jsp">Login</a></li>
					<li><a href="Regis.html">Register</a></li>
					<li><a href="Customer.html">Customer Care</a></li>
				</ul>
		</nav>
		<form action="Login.jsp" method="post">
			<div class="login">
				<h1>Login</h1>
				<div class="textbox">
					<input type="text" placeholder="Username" name="uname">
				</div>
				<div class="textbox">
					<input type="password" placeholder="Password" name="password">
				</div>
				<input class="btn" type="submit" value="Login">
			</div>
		</form> 
	</body>
</html>