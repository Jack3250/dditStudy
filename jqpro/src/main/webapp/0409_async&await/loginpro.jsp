<%@page import="com.google.gson.Gson"%>
<%@page import="kr.or.ddit.member.vo.MemberVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	MemberVo member = (MemberVo)request.getAttribute("member");
	
	Gson gson = new Gson();
	
	String result = gson.toJson(member);
	
	out.print(result);
	out.flush();
%>