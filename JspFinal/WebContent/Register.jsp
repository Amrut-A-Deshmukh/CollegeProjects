<%@ page import="cust.*" %>
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
<%
		String uname=request.getParameter("uname");
		String pwd=request.getParameter("password");
		String mn=request.getParameter("mobileno");
		String dob=request.getParameter("dob");
		String eid=request.getParameter("email");
		int i,r;
		Func f=new Func();
		i=f.RegisCheck(uname,pwd,mn,dob,eid);
		if(i==1)
		{
%>
			<%@ include file="Regis.html" %>
			<div class="pa">
				<p>PLEASE ENTER A VALID MOBILE NUMBER</p>
			</div>
<%
		}
		else if(i==2)
		{
%>
			<%@ include file="Regis.html" %>
			<div class="pa">
				<p>PLEASE ENTER A VALID DATE</p>
			</div>
<%
		}
		else if(i==3)
		{
%>
			<%@ include file="Regis.html" %>
			<div class="pa">
				<p>PLEASE ENTER THE DATE OF BIRTH IN THE FORMAT DD/MM/YYYY</p>
			</div>
<%			
		}
		else if(i==0)
		{
			r=f.Regis(uname,pwd,mn,dob,eid);
%>
			<%@ include file="Regis.html" %>
			<div class="pa">
				<p>REGISTERED SUCCESSFULLY</p>
			</div>
<%
		}
		else if(i==4)
		{
%>
			<%@ include file="Regis.html" %>
			<div class="pa">
				<p>USERNAME ALREADY EXISTS</p>
			</div>
<%	
		}
%>
	</body>
</html>