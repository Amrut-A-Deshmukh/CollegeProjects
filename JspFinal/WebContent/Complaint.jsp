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
					<li><a href="Care.html">Customer Care</a></li>
					<li><a href="Home.jsp">Logout</a></li>
				</ul>
		</nav>
<%
		String uname=request.getParameter("uname");
%>
		<form action="Complain.jsp" method="post">
			<div class="login">
				<h1>Complaint Booking</h1>
				<div class="textbox">
					<input type="text" placeholder="Complaint" name="comp">
				</div>
				<input class="btn" type="submit" value="Submit">
			</div>
			<input type="hidden" value=${param.uname} name="uname"/>
		</form>
	</body>
</html>