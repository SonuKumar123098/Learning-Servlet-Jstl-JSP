<%@page import="java.util.Scanner"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ include file="header.jsp" %>
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
	int coef = 3;
	%>
	My favorite number is:
	<%=coef%>
	<%=// expression tag-> from this tag code goes to out.prtin();
		k%>
	<!-- Some notes about  JSP Directive has three tag
		@page  ->  importing a package, this page handles the exeption or not
		@include ->if you want to other jsp page in your jsp page you can use include
		@taglib -> library of tag, you can external tag like spring framework in you page
		
		@Page  -->
	<!--   attribute="value" attribute="value"
		all attributes are below
		language="scripting language" java
		extends="classname" 
		import="importList"
		session="true|false"
		autoFlush="true|false"
		contentType="ctinfo" ->send response to client it can be html page
		errorPage="error_url"  
		isErrorPage="true|false"
		info="information"
		isELIgnored="true|false"
		isThreadSafe="true|false"  
		
		@include 
		file="filename"
		file="header.jsp"
		
		@taglib
		uri="uri" - library
		prefix="fx" - 
		if you want to use <navin> tag, then you can use <fx:navin> this means navin belong to  fx
		
		-->
</body>
</html>