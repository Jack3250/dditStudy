package kr.or.ddit.lprod.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.lprod.vo.LprodVo;
import kr.or.ddit.mybatis.config.MybatisUtil;

public class LprodDaoImpl implements ILprodDao{
	// 싱글톤 패턴
	private static LprodDaoImpl instance;
	
	private LprodDaoImpl() {
		
	}
	
	public static LprodDaoImpl getInstance() {
		if (instance == null) {
			instance = new LprodDaoImpl();
		}
		return instance;
	}
	
	@Override
	public List<LprodVo> lprodList() {
		SqlSession sql = MybatisUtil.getInstance();
		List<LprodVo> list = null;
		
		try {
			list = sql.selectList("lprod.lprodList");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(sql != null) {
				sql.commit();
				sql.close();
			}
		}
		
		return list;
	}
}
