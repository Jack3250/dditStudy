package kr.or.ddit.member.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.or.ddit.member.service.IMemberService;
import kr.or.ddit.member.service.MemberServiceImpl;
import kr.or.ddit.member.vo.MemberVo;

import java.io.IOException;
import java.util.List;

@WebServlet("/MemberList.do")
public class MemberList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 클라이언트 전송 데이터 받기
		
		// service 객체 얻기
		IMemberService iMemberService = MemberServiceImpl.getinstance();
		
		// service 메소드 호출
		List<MemberVo> list = iMemberService.memberList();
		// 결과값을 request에 저장
		request.setAttribute("sdjkfsdkfjsd", list);
		
		// view페이지로 이동
		request.getRequestDispatcher("/0408_fetch/memberList.jsp").forward(request, response);
	}

}
