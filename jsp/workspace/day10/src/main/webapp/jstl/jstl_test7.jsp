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
	<c:choose>
		<c:when test="${empty param.dan }">
			<form>
				단 <input type="text" name="dan"><br>
				<input type="submit">
			</form>
		</c:when>
		<c:otherwise>
			<c:set var="dan" value="${param.dan }" />
			<c:choose>
				<c:when test="${dan >= 1 and dan <= 100 }">
					<c:forEach var="i" begin="1" end="9" step="1">
						${dan } X ${i } = ${dan * i }<br>
					</c:forEach>		
				</c:when>
				<c:otherwise>
					1이상 100이하의 숫자를 입력하세요!
				</c:otherwise>			
			</c:choose>
			<input type="button" value="홈으로 돌아가기" onclick="history.go(-1)">
		</c:otherwise>
	</c:choose>
	
</body>
</html>















