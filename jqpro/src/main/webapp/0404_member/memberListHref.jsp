<%@page import="kr.or.ddit.mybatis.config.MybatisUtil"%>
<%@page import="kr.or.ddit.member.vo.MemberVo"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.ibatis.session.SqlSession"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<%
	//서버 영역 (controller - 서블릿)

	//직렬화 된 데이터를 javascript에서 가져온다.

	//자바 객체로 역직렬화 함.
	//=====================================================

	//DB연결 이후 CRUD처리 및 결과값 반환
	//ex) List<MemberVo> list 객체에 모든 인원의 데이터를 담아 가져옴
	SqlSession sql = MybatisUtil.getInstance();
	List<MemberVo> list = sql.selectList("member.memberList");
	sql.close();
	%>
	<table border='1' class='table table-striped'>
		<thead>
			<tr>
				<th>아이디</th>
				<th>이름</th>
				<th>주소</th>
				<th>전화번호</th>
				<th>이메일</th>
			</tr>
		</thead>
		<%
		for (MemberVo member : list) {
// 		for(int i=0; i<list.size(); i++) {
// 			MemberVo member = list.get(i);	
		%>
			<tr>
				<td><%=member.getMem_id()%></td>
				<td><%=member.getMem_name()%></td>
				<td><%=member.getMem_add1()%></td>
				<td><%=member.getMem_hp()%></td>
				<td><%=member.getMem_mail()%></td>
			</tr>
		<%
		}
		%>
	</table>
</body>
</html>