<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- param.userid가 empty 일때 -->
	<c:choose>
		<c:when test="${empty param.userid }">
			<form action="">
				아이디 <input type="text" name="userid"><br>
				패스워드 <input type="password" name="userpw"><br>
				<input type="submit">
			</form>
		</c:when>
		<%-- 
			userid값이 있는 경우
			 - userid == admin : 관리자
			 - userid == apple : 김사과
			 - userid == 그 외  : 비회원
		 --%>
		 <%-- param.userid가 empty가 아닌경우 --%>
		 <c:otherwise>
		 	<c:set var="userid" value="${param.userid }" />
		 	<c:set var="userpw" value="${param.userpw }" />
		 	<c:choose>
				<c:when test="${userid == 'admin' }">관리자</c:when>
				<c:when test="${userid == 'apple' }">김사과</c:when>
				<c:otherwise>비회원</c:otherwise>
		 	</c:choose>
		 </c:otherwise>
	</c:choose>
</body>
</html>















