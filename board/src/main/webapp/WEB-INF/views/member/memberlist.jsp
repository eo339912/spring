<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="member" items="${list}">
		아이디 : ${member.id}, 이름 : ${member.name},
		비밀번호 :  ${member.pwd}, 취미: ${member.hobby},
		성별 :  ${member.gender}, 종교: ${member.religion},
		자기소개 :  ${member.introduction}, 등록날짜: ${member.regdt}
		<br>
	</c:forEach>
	<br>
	<a href="main.do">홈</a>
</body>
</html>