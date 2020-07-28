<%@page import="java.util.*" %>
<%@page import="cust.*" %>
<html>
	<head>
		<title>BESCOM</title>
		<link rel="stylesheet" type="text/css" href="style.css">
		<style>
			::placeholder 
			{
  				color: white;
			}
			.marquee
		 	{
				height: 50px;	
				overflow: hidden;
				position: relative;
			}
			.marquee h3 
			{
				position: absolute;
				width: 100%;
				height: 100%;
				margin: 0;
				line-height: 50px;
				text-align: left;
				-moz-animation: marquee 5s linear infinite alternate;
				-webkit-animation: marquee 5s linear infinite alternate;
				animation: marquee 5s linear infinite alternate;
			}
			@-moz-keyframes marquee
			{
				0%   { -moz-transform: translateX(70%); }
				100% { -moz-transform: translateX(0%); }
			}
			@-webkit-keyframes marquee 
			{
				0%   { -webkit-transform: translateX(70%); }
				100% { -webkit-transform: translateX(0%); }
			}
			@keyframes marquee 
			{
				0%   
				{ 
					-moz-transform: translateX(70%); /* Firefox bug fix */
					-webkit-transform: translateX(70%); /* Firefox bug fix */
					transform: translateX(70%); 		
				 }
				 100% 
				 { 
				 	-moz-transform: translateX(0%); /* Firefox bug fix */
				 	-webkit-transform: translateX(0%); /* Firefox bug fix */
				 	transform: translateX(0%); 
				 }
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
		Random rand=new Random();
		String uname=request.getParameter("uname");
		int a=rand.nextInt(1000);
		Func f=new Func();
		float u=f.price(a);
%>
		<div class="marquee">
			<h3><font color="white">TOTAL AMOUNT TO BE PAID IS Rs.<%out.println(u); %>.</font></h3>
		</div>
		<form action="Pay.jsp" method="post">
			<div class="login">
				<h1>Bill Payment</h1>
				<div class="textbox">
					<input type="text" placeholder="Card Number" name="card">
				</div>
				<div class="textbox">
					<input type="date" placeholder="Expiry Date" name="expdate">
				</div>
				<div class="textbox">
					<input type="password" placeholder="CVV" name="cvv">
				</div>
				<div class="textbox">
					<input type="text" placeholder="Card Name" name="cname">
				</div>
				<div class="textbox">
					<input type="text" placeholder="Bank Name" name="bname">
				</div>
				<div class="textbox">
					<input type="date" placeholder="Today's Date" name="date">
				</div>
				<input class="btn" type="submit" value="Submit">
			</div>
			<input type="hidden" value=${param.uname} name="uname"/>
			<%
				session.setAttribute("units",a);
				session.setAttribute("price",u);
			%>
		</form>
		<div align="center">
			<p><font color="white">YOU HAVE CONSUMED <%out.println(a); %> UNITS.</font></p>
		</div>
	</body>
</html>