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
	String cars1 = request.getParameter("cars1");
	String[] cars2 = request.getParameterValues("cars2");
	
	String str = "";
	
	for(String tokens : cars2) {
		str += tokens + "<br>";
	}
	%>
	
	<table border="1">
		<tr>
			<th>차량 1</th>
			<td><%= cars1 %></td>
		</tr>
		
		<tr>
			<th>차량 2</th>
			<td><%= str %></td>
		</tr>
	</table>
	



</body>
</html>