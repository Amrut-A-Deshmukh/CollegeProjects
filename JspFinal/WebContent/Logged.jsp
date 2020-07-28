<%@page import="cust.*" %>
<html>
	<head>
		<title>BESCOM</title>
		<link rel="stylesheet" type="text/css" href="style.css">
		<style>
			.con
			{
				text-align:center;
				margin-top:420px;
			}
			.butn
			{
				border:1px solid #94641b;
				background:none;
				padding:10px 20px;
				font-size:20px;
				font-family:"montserrat";
				cursor:pointor;
				margin:10px;
				transition:0.8s;
				position:relative;
				overflow:hidden;
			}
			.butn1
			{
				color:#fff;
			}
			.butn1:hover
			{
				color:#fff;
			}
			.butn::before
			{
				content:"";
				position:absolute;
				left:0;
				width:100%;
				height:0%;
				background:#94641b;
				z-index:-1;
				transition:0.8s;
			}
			.butn1::before
			{
				top:0;
				border-radius:0 0 50% 50%;
			}
			.butn1:hover::before
			{
				height:180%;
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
		<div class="con">
			<div class="Login">
				<h1>Welcome ${param.uname}</h1>
			</div>
			<form action="PayBill.jsp" method="post">
				<input type="hidden" value=${param.uname} name="uname"/>
				<button type="submit" class="butn butn1">Pay Your Bill</button>
			</form>
			<form action="Complaint.jsp" method="post">
				<input type="hidden" value=${param.uname} name="uname"/>
				<button type="submit" class="butn butn1">Book a Complaint</button>
			</form>
			<form action="Care.html" method="post">
				<button type="submit" class="butn butn1">Customer Care</button>
			</form>
		</div>
	</body>
</html>