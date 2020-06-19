<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>회원입력</title>
</head>
<body>
	<div align="center">
		<div>회원 입력 화면</div>
		<div>
			<form id="frm" name="frm" action="memberinsert.do" method="post">
				<div>
					<table border="1">
						<tr>
							<th width="100">아이디</th>
							<td><input type="text" id="id" name="id" size="70"/></td>
						</tr>
						<tr>
							<th width="100">이름</th>
							<td><input type="text" id="name" name="name" size="70"/></td>
						</tr>
						<tr>
							<th width="100">패스워드</th>
							<td><input type="pwd" id="pwd" name="pwd" size="70"/></td>
						</tr>
						<tr>
							<th width="100">성별</th>
							<td><input type="text" id="gender" name="gender" size="70"/></td>
						</tr>
						<tr>
							<th width="100">가입날짜</th>
							<td><input type="datetime-local" id="regdt" name="regdt" size="70"/></td>
						</tr>
					</table>
				</div>
				<input type="submit" value="전송"/> <input type="reset" value="취소"/>
			</form>
		</div>
	</div>
</body>
</html>