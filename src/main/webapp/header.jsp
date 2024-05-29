<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%= 7+6 %>
<%
pageContext.setAttribute("name", "navin" , PageContext.SESSION_SCOPE);
//pagecontext attribute remain only in same page
//scope pageContext.scope 

// Exception handling in JSP
 // int result=9/0;
%>
</body>
</html>