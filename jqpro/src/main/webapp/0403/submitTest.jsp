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
	String userName = request.getParameter("name");
	String userTel = request.getParameter("tel");
	// db에연결해서 CRUD작업하고 db에서 결과를 가져왔다고 가정. 
	
	// 현재는 사용하지 않는 방식
	/* out.print(userName);
	out.print("<p>이름 : " + userName + "</p>"); */
%>

<p>이름 : <%= userName %> </p>
<p>전화번호 : <%= userTel %></p>

</body>
</html>