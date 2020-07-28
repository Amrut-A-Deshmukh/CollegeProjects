<%@page import="cust.*" %>
<html>
	<head>
		<title>BESCOM</title>
	</head>
	<body>
<%
		Func f=new Func();
		String CNum=request.getParameter("card");
		String exp=request.getParameter("expdate");
		String cvv=request.getParameter("cvv");
		int cv=Integer.parseInt(cvv);
		String CName=request.getParameter("cname");
		String BName=request.getParameter("bname");
		String uname=request.getParameter("uname");
		String date=request.getParameter("date");
		String units=session.getAttribute("units").toString();
		String price=session.getAttribute("price").toString();
		int i=f.payCheck(CNum,cv);
		int r=f.PID()+1;
		if(i==1)
		{
%>			<jsp:include page="PayBill.jsp">
				<jsp:param value="<%=request.getParameter(\"uname\")%>" name="uname"/>			
			</jsp:include>
			<div class="pa">
				<p>INVALID CARD NUMBER</p>
			</div>
<%
		}
		else if(i==2)
		{
%>			<jsp:include page="PayBill.jsp">
				<jsp:param value="<%=request.getParameter(\"uname\")%>" name="uname"/>			
			</jsp:include>
			<div class="pa">
				<p>INVALID CVV</p>
			</div>
<%
		}
		else
		{
			int s=f.PayIns(r,uname,date,units,price);
%>			<jsp:include page="Logged.jsp">
				<jsp:param value="<%=request.getParameter(\"uname\")%>" name="uname"/>			
			</jsp:include>
			<div class="pa">
				<p>BILL PAYED SUCCESSFULLY</p>
			</div>
<%
		}
%>
	</body>
</html>