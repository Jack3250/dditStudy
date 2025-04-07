<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 직렬화 된 데이터를 javascript에서 가져온다.
	
	// 자바 객체로 역직렬화 함.
	
	// DB연결 이후 CRUD처리 및 결과값 반환
	
	// ex) MemberVo member 객체에 데이터를 담아 가져옴

	// MemberVo에 담아온 결과값을 직렬화 하여 javascript로 전송
%>
<%-- 해당 데이터가 수신되었다고 가정 --%>

{
	"mem_id" : "a001",
	"mem_name" : "가나다",
	"mem_hp" : "010-0000-0000",
	"mem_mail" : "aaaa@aaaa.or.kr"
}