<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String userName = request.getParameter("user_name");

	if( userName == null ){
		userName = "이름이 없습니다.";		
	}
	
	userName = userName.trim();
	if( userName.equals("") ){
		userName = "이름을 입력하세요.";
	}
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1><%=userName %></h1>
</body>
</html>





















