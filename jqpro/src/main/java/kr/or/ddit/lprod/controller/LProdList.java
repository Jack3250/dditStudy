package kr.or.ddit.lprod.controller;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.or.ddit.lprod.service.ILprodService;
import kr.or.ddit.lprod.service.LprodServiceImpl;
import kr.or.ddit.lprod.vo.LprodVo;

@WebServlet("/LProdList.do")
public class LProdList extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	ILprodService iLprodService = LprodServiceImpl.getInstance();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<LprodVo> list = iLprodService.lprodList();
		request.setAttribute("list", list);
		request.getRequestDispatcher("/0407_lprod/lprodList.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
