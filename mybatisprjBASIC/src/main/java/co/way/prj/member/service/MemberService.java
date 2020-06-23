package co.way.prj.member.service;

import java.util.List;

public interface MemberService {
	public List<MemberVO> getMemberList();
	public MemberVO getMember(MemberVO vo);
	public void setMemberInsert(MemberVO vo);
	public void setMemberUpdate(MemberVO vo);
	public void setMemberDelete(MemberVO vo);
}
