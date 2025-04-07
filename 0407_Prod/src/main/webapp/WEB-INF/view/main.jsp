<%@page import="kr.or.ddit.vo.ProdTypeVo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	List<ProdTypeVo> typeList = (List)request.getAttribute("typeList");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
</head>
<body>
	메인페이지<br>
	<select id="typeList1">
		<option value="-1">대분류</option>
		<%
			for(ProdTypeVo type : typeList) {
				String select = "";
		%>
				<option value="<%=type.getTypeNo()%>" <%=select%>><%=type.getTypeName()%></option>
		<%
			}
		%>
	</select>
	
	<select id="typeList2">
		<option value="-1">중분류</option>
	</select>
	<br> <br>
	<div id="prodTable"></div>
	
	<script type="text/javascript">
		let typeList = document.getElementById("typeList1")
		typeList.addEventListener("change", function() {
			let select = typeList.value;
			$.ajax({
				type : 'post',
				url  : '/0407_Prod/typeList2',
				data : {
					typeNo : select
				},
				success : function(data) {
					var str = '<option value=-1>중분류</option>';
					for(var i=0; i<data.length; i++) {
						var type = data[i];
						str += '<option value='+type.typeNo+'>'+type.typeName+'</option>'
					}
					$('#typeList2').html(str);
				}
			});
		});

		let typeList2 = document.getElementById("typeList2")
		typeList2.addEventListener("change", function() {
			let select = typeList2.value;
			$.ajax({
				type : 'post',
				url  : '/0407_Prod/prodList.do',
				data : {
					typeNo : select
				},
				dataType : 'json',
				success : function(data) {
					let str = `
					<table border='1'>
						<thead>
							<tr>
								<th>제품번호</th>
								<th>제품명</th>
								<th>제품설명</th>
								<th>가격</th>
							</tr>
						</thead>
						<tbody>`;
						
					for(let i=0; i<data.length; i++) {
						let prod = data[i];
						str += `
							<tr>
								<td>\${prod.prodNo}</td>
								<td>\${prod.name}</td>
								<td>\${prod.content}</td>
								<td>\${prod.price}</td>
							</tr>`;
					}
					str += `
						</tbody>
					</table>`;

					$('#prodTable').html(str);
				}
			});
		});
		
	</script>
</body>
</html>