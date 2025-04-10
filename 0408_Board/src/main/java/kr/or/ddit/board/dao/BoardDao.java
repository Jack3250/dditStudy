package kr.or.ddit.board.dao;

import java.util.List;

import kr.or.ddit.util.MybatisDao;
import kr.or.ddit.vo.BoardCodeVo;
import kr.or.ddit.vo.BoardVo;

public class BoardDao extends MybatisDao{

	private static BoardDao instance;

	private BoardDao() {

	}

	public static BoardDao getInstance() {
		if (instance == null) {
			instance = new BoardDao();
		}
		return instance;
	}
	
	public List<BoardCodeVo> codeList() {
		return selectList("board.codeList");
	}

	public List<BoardVo> boardList(BoardVo board) {
		return selectList("board.boardList", board);
	}

	public BoardVo boardView(BoardVo board) {
		return selectOne("board.boardView", board);
	}

	public BoardVo boardDelete(BoardVo board) {
		return selectOne("board.boardDelete", board);
	}
	
	public int getBoardNo() {
		return selectOne("board.getBoardNo");
	}
	
	public void boardInsert(BoardVo board) {
		selectOne("board.boardInsert", board);
	}
}
