package kr.or.ddit.member.dao;

import java.util.List;

import kr.or.ddit.member.vo.MemberVo;

public interface IMemberDao {
	// 전체리스트 가져오기
	public List<MemberVo> memberList();

	public MemberVo memberLogin(MemberVo login);
}
