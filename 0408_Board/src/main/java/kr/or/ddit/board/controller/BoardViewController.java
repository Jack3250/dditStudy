package kr.or.ddit.board.controller;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.or.ddit.board.service.BoardService;
import kr.or.ddit.vo.BoardVo;

@WebServlet("/board/boardView.do")
public class BoardViewController extends HttpServlet{
	
	BoardService boardService = BoardService.getInstance();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String boardNoStr = req.getParameter("boardNo");
		
		BoardVo board = new BoardVo();
		board.setBoardNo(Integer.parseInt(boardNoStr));
		
		board = boardService.boardView(board);
		System.out.println(board);
		req.setAttribute("board", board);
		
		ServletContext ctx = req.getServletContext();
		ctx.getRequestDispatcher("/WEB-INF/view/board/boardView.jsp").forward(req, resp);
	}
}
