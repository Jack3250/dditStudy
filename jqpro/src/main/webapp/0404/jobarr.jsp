<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 직렬화 된 데이터를 javascript에서 가져온다.
	
	// 자바 객체로 역직렬화 함.
	
	// DB연결 이후 CRUD처리 및 결과값 반환
	
	// ex) List<MemberVo> list 객체에 모든 인원의 데이터를 담아 가져옴

	// List에 담아온 결과값을 직렬화 하여 javascript로 전송
%>
<%-- 해당 데이터가 수신되었다고 가정 --%>
[
	{
	"mem_id" : "a001",
	"mem_name" : "가나다",
	"mem_hp" : "010-0000-0000",
	"mem_mail" : "aaaa@aaaa.or.kr"
	},
	{
	"mem_id" : "a002",
	"mem_name" : "나다라",
	"mem_hp" : "010-1111-1111",
	"mem_mail" : "bbbb@bbbb.or.kr"
	},
	{
	"mem_id" : "a003",
	"mem_name" : "다라마",
	"mem_hp" : "010-2222-2222",
	"mem_mail" : "cccc@cccc.or.kr"
	},
	{
	"mem_id" : "a004",
	"mem_name" : "라마바",
	"mem_hp" : "010-3333-3333",
	"mem_mail" : "dddd@dddd.or.kr"
	},
	{
	"mem_id" : "a005",
	"mem_name" : "마바사",
	"mem_hp" : "010-4444-4444",
	"mem_mail" : "eeee@eeee.or.kr"
	}
]