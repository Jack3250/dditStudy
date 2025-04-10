package kr.or.ddit.board.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.or.ddit.board.service.BoardService;
import kr.or.ddit.vo.BoardVo;

@WebServlet("/board/boardDelete.do")
public class BoardDeleteController extends HttpServlet{

	BoardService boardService = BoardService.getInstance();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String boardNoStr = req.getParameter("boardNo");
		int boardNo = Integer.parseInt(boardNoStr);
		
		String codeNoStr = req.getParameter("codeNo");
		int codeNo = Integer.parseInt(codeNoStr);
		
		BoardVo board = new BoardVo();
		board.setBoardNo(boardNo);
		
		boardService.boardDelete(board);
		resp.sendRedirect("/0408_Board/board/boardList.do?codeNo="+codeNo);
		
	}
}
