<%@page import="com.google.gson.GsonBuilder"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="kr.or.ddit.member.vo.MemberVo"%>
<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.mybatis.config.MybatisUtil"%>
<%@page import="org.apache.ibatis.session.SqlSession"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// 서버 영역 (controller - 서블릿)

// 직렬화 된 데이터를 javascript에서 가져온다.

// 자바 객체로 역직렬화 함.
//=====================================================

// DB연결 이후 CRUD처리 및 결과값 반환
// ex) List<MemberVo> list 객체에 모든 인원의 데이터를 담아 가져옴
SqlSession sql = MybatisUtil.getInstance();
List<MemberVo> list = sql.selectList("member.memberList");
sql.close();

// List에 담아온 결과값을 직렬화 하여 javascript로 전송
// json을 다루는 Gson 라이브러리의 객체 생성
// Gson gson = new Gson();
Gson gson = new GsonBuilder().setPrettyPrinting().create();

// list객체를 javascript로 전송하기 위해 json형태로 직렬화 함
String result = gson.toJson(list);

out.print(result);
out.flush();

%>