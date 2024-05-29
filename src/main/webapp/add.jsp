<%@page import="java.util.Scanner"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
	<%@ page import="java.util.Date"%>
	<%!// above one is directive tag
	//  declaration tag, from this tage code goes out side the service method
	// in this tag you can define other method also%>
	<%
	// scriplet tag , from this tag code goes in service method

	int i = Integer.parseInt(request.getParameter("num1"));
	int j = Integer.parseInt(request.getParameter("num2"));
	int k = i + j;
	k = k * k;
	out.print(k);
	Scanner sc = new Scanner(System.in);
	int coef=3;
	%>
	My favorite number is: <%=coef%>
	<%=// expression tag-> from this tag code goes to out.prtin();
		k%>
</body>
</html>