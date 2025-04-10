<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>JSP : Java Server Page</h1>

	<%
	// BackEnd Part
	// 입력한 이름과 비밀번호를 가져온다.
	String userName = request.getParameter("name");
	String userPass = request.getParameter("pass");
	
	// DB연결해서 CRUD 작업을 수행한다.

	
	// 수행 결과값을 응답페이지 생성
	%>

	<table border="1">
		<tr>
			<td>이름</td>
			<td><%= userName %></td>
		</tr>

		<tr>
			<td>전화번호</td>
			<td><%= userPass %></td>
		</tr>
	</table>

</body>
</html>