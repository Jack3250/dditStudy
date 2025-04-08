<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// 클라이언트 전송 데이터 수신 - id, name, email
String userId    = request.getParameter("id");
String userName  = request.getParameter("name");
String userEmail = request.getParameter("email");

// DB와 연결 후 Insert 처리 후 결과값 수신

// 자바객체 결과값을 가지고 텍스트 기반의 json 형식의 문자열 데이터 만들기

%>

{
	"id" : "<%= userId %>",
	"name" : "<%= userName %>",
	"email" : "<%= userEmail %>"
}