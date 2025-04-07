<%@page import="kr.or.ddit.vo.ProdTypeVo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 동기방식 -->
<%
	List<ProdTypeVo> typeList = (List)request.getAttribute("typeList");
	List<ProdTypeVo> typeList2 = (List)request.getAttribute("typeList2");
	Integer typeNo = (Integer) request.getAttribute("typeNo");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	메인페이지<br>
	<select id="typeList1">
		<option value="-1">대분류</option>
		<%
			for(ProdTypeVo type : typeList) {
				String select = "";
				if(typeNo != null && type.getTypeNo() == typeNo) {
					select = "selected";
				}
		%>
				<option value="<%=type.getTypeNo()%>" <%=select%>><%=type.getTypeName()%></option>
		<%
		}
		%>
	</select>
	
	<select id="typeList2">
		<option value="-1">중분류</option>
		<%
			if(typeList2 != null) {
				for(ProdTypeVo type : typeList2) {
		%>
				<option value="<%=type.getTypeNo()%>"><%=type.getTypeName()%></option>
		<%			
				}
			}
		%>
	</select>
	<script type="text/javascript">
	let typeList = document.getElementById("typeList1")
	typeList.addEventListener("change", function() {
		let select = typeList.value;
		location.href = 'main.do?typeNo='+select;
	});
	</script>
</body>
</html>