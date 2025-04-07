package kr.or.ddit.lprod.dao;

import java.util.List;

import kr.or.ddit.lprod.vo.LprodVo;

public interface ILprodDao {
	/*
	 *	전체 리스트 가져오기
	 *	parameter : null
	 *	result : List<LprodVo> 
	 */
	public List<LprodVo> lprodList();
}
