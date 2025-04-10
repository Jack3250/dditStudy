package kr.or.ddit.member.controller;

import java.io.BufferedReader;
import java.io.IOException;

import com.google.gson.Gson;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.or.ddit.member.service.IMemberService;
import kr.or.ddit.member.service.MemberServiceImpl;
import kr.or.ddit.member.vo.MemberVo;

@WebServlet("/LoginController.do")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	IMemberService memberService = MemberServiceImpl.getinstance();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		/*
		// - parameter 방식
		// 클라이언트 전송데이터 받기(mem_id, mem_pass)
		MemberVo member = new MemberVo();
		member.setMem_id(request.getParameter("mem_id"));
		member.setMem_pass(request.getParameter("mem_pass"));
		*/
		
		// - 직렬화 방식
		String reqData = FetchDataChange.dataChange(request);
		
		// 역직렬화 - 자바 객체 생성 Json데이터로부터 내용을 Vo에 담음
		Gson gson = new Gson();
		MemberVo member = gson.fromJson(reqData, MemberVo.class);
		
		
		
		// 공통
		// service 메소드 호출
		member = memberService.memberLogin(member);
		
		// 결과값을 request에 저장
		request.setAttribute("member", member);
		
		// view페이지로 이동
		request.getRequestDispatcher("/0409_async&await/loginpro.jsp").forward(request, response);
	}
}