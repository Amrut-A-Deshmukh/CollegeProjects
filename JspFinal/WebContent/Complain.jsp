<%@page import="cust.*" %>
<html>
	<head>
		<title>BESCOM</title>
		<link rel="stylesheet" type="text/css" href="style.css">
	</head>
	<body>
<%
		String name=request.getParameter("uname");
		String comp=request.getParameter("comp");
		Func f=new Func();
		int r=f.CNo()+1;
		int s=f.Comp(name,comp,r);
%>		
		<jsp:include page="Logged.jsp">
			<jsp:param value="<%=request.getParameter(\"uname\")%>" name="uname"/>			
		</jsp:include>
		<div class="pa">
			<p>YOUR COMPLAINT WILL BE RESOLVED SOON. YOUR COMPLAINT NUMBER IS <%out.println(r); %></p>
		</div>
	</body>
</html>