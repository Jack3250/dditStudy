<%@page import="com.google.gson.Gson"%>
<%@page import="kr.or.ddit.fetch.vo.SerialVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// controller에서 저장한 데이터 꺼내기
SerialVo vo = (SerialVo) request.getAttribute("userData");

// vo 자바 객체를 직렬화 한다.
Gson gson = new Gson();

String result = gson.toJson(vo);

out.print(result);
out.flush();
%>