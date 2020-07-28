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
			Func f=new Func();
			int i=f.Log(uname,pwd);
			if(i==1)
			{
		%>		
				<jsp:include page="Logged.jsp">
					<jsp:param value="<%=request.getParameter(\"uname\")%>" name="uname"/>
				</jsp:include>
		<%	
			}
			else
			{
		%>		
				<%@include file="Home.jsp"%>
				<div class="pa">
					<p>INVALID USERNAME OR PASSWORD</p>
				</div>
		<%		
			}
		%>
	</body>
</html>