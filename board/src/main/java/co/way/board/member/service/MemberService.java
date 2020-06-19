package co.way.board.member.service;

import java.util.List;

public interface MemberService {
	public List<MemberVO> getMemberList();
	public MemberVO getMemberSelect(MemberVO vo);
	public void setMemberInsert(MemberVO vo);
	public void setMemberDelete(MemberVO vo);
	public void setMemberUpdate(MemberVO vo);
}
