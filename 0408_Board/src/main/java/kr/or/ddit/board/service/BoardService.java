package kr.or.ddit.board.service;

import java.util.List;

import kr.or.ddit.board.dao.BoardDao;
import kr.or.ddit.vo.BoardCodeVo;
import kr.or.ddit.vo.BoardVo;

public class BoardService {
	
	private static BoardService instance;

	private BoardService() {

	}

	public static BoardService getInstance() {
		if (instance == null) {
			instance = new BoardService();
		}
		return instance;
	}

	BoardDao boardDao = BoardDao.getInstance();
	
	public List<BoardCodeVo> codeList() {
		return boardDao.codeList();
	}

	public List<BoardVo> boardList(BoardVo board) {
		return boardDao.boardList(board);
	}

	public BoardVo boardView(BoardVo board) {
		return boardDao.boardView(board);
	}

	public BoardVo boardDelete(BoardVo board) {
		return boardDao.boardDelete(board);
	}
	
	public int getBoardNo() {
		return boardDao.getBoardNo();
	}
	
	public void boardInsert(BoardVo board) {
		boardDao.boardInsert(board);
	}
}
