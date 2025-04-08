package kr.or.ddit.member.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.member.vo.MemberVo;
import kr.or.ddit.mybatis.config.MybatisUtil;

public class MemberDaoImpl implements IMemberDao{

	private static IMemberDao instance;

	private MemberDaoImpl() {

	}

	public static IMemberDao getInstance() {
		if (instance == null) {
			instance = new MemberDaoImpl();
		}
		return instance;
	}

	@Override
	public List<MemberVo> memberList() {
		SqlSession sql = MybatisUtil.getInstance();
		List<MemberVo> list = null;
		
		try {
			list = sql.selectList("member.memberList");
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
