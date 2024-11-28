<%@page import="com.codingbox.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		MemberDao mdao = new MemberDao();
		request.setAttribute("list", mdao.getList());
		pageContext.forward("searchview.jsp");
	%>
</body>
</html>















