package co.way.prj.member.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.way.prj.member.map.MemberMap;
import co.way.prj.member.service.MemberService;
import co.way.prj.member.service.MemberVO;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberMap memberMap;
	
	@Override
	public List<MemberVO> getMemberList() {
		// TODO Auto-generated method stub
		return memberMap.getMemberList();
	}

	@Override
	public MemberVO getMember(MemberVO vo) {
		// TODO Auto-generated method stub
		return memberMap.getMember(vo);
	}

	@Override
	public void setMemberInsert(MemberVO vo) {
		// TODO Auto-generated method stub
		memberMap.setMemberInsert(vo);
	}

	@Override
	public void setMemberUpdate(MemberVO vo) {
		// TODO Auto-generated method stub
		memberMap.setMemberUpdate(vo);
	}

	@Override
	public void setMemberDelete(MemberVO vo) {
		// TODO Auto-generated method stub
		memberMap.setMemberDelete(vo);
	}

}
