<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>

table {
	border: 2px solid blue;
	border-spacing: 5px;
}

td {
	width: 300px;
	height: 50px;
	text-align: center;
}

th {
	width: 300px;
	background: skyblue;	
}

</style>

</head>
<body>

<%
	//전송데이터 받기
	String userId = request.getParameter("id");
	String[] foods = request.getParameterValues("food");
	String file = request.getParameter("file");
	
	String str ="";
	
	for(String tokens : foods){
		str += tokens + "<br>";
	}
	
%>

<table border="1">

	<tr>
		<th>아이디</th>
		<td><%= userId %></td>
	</tr>
	
	<tr>
		<th>음식</th>
		<td><%= str %></td>
	</tr>
	
	<tr>
		<th>파일</th>
		<td><%= file %></td>
	</tr>



</table>

</body>
</html>