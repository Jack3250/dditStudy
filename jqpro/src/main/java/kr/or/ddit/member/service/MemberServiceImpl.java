package kr.or.ddit.member.service;

import java.util.List;

import kr.or.ddit.member.dao.IMemberDao;
import kr.or.ddit.member.dao.MemberDaoImpl;
import kr.or.ddit.member.vo.MemberVo;

public class MemberServiceImpl implements IMemberService {

	private static IMemberService instance;
	
	private MemberServiceImpl() {
		
	}
	
	public static IMemberService getinstance() {
		if(instance == null) {
			instance = new MemberServiceImpl();
		}
		
		return instance;
	}
	
	private IMemberDao iMemberDao = MemberDaoImpl.getInstance();
	
	@Override
	public List<MemberVo> memberList() {
		return iMemberDao.memberList();
	}
	
	@Override
	public MemberVo memberLogin(MemberVo login) {
		return iMemberDao.memberLogin(login);
	}
}
