package kr.or.ddit.lprod.service;

import java.util.List;

import kr.or.ddit.lprod.dao.ILprodDao;
import kr.or.ddit.lprod.dao.LprodDaoImpl;
import kr.or.ddit.lprod.vo.LprodVo;

public class LprodServiceImpl implements ILprodService{
	
	private static LprodServiceImpl instance;

	private LprodServiceImpl() {

	}

	public static LprodServiceImpl getInstance() {
		if (instance == null) {
			instance = new LprodServiceImpl();
		}
		return instance;
	}

	ILprodDao lprodDao = LprodDaoImpl.getInstance();
	
	@Override
	public List<LprodVo> lprodList() {
		List<LprodVo> list = null;
				
		list = lprodDao.lprodList();
		
		return list;
	}

}
