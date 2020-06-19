<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>회원관리</title>
</head>
<body>
<div align="center">
	<div><h1>회원목록</h1></div>
	<div>
		<table border="1">
			<thead>
			<tr>
			<th width="100">아이디</th>
			<th width="100">비밀번호</th>
			<th width="100">이름</th>
			<th width="100">취미</th>
			<th width="100">성별</th>
			<th width="100">종교</th>
			<th width="100">자기소개</th>
			<th width="200">가입날짜</th>		
		</tr>
		</thead>
		<tbody>
			<c:forEach var="vo" items="${member}">
			<tr>
			<td>${vo.id}</td>
			<td>${vo.pwd}</td>
			<td>${vo.name}</td>
			<td>${vo.hobby}</td>
			<td>${vo.gender}</td>
			<td>${vo.religion}</td>
			<td>${vo.introduction}</td>
			<td>${vo.regdt}</td>
			
			
			</c:forEach>
		</tbody>
		</table>
	</div>

</div>
</body>
</html>