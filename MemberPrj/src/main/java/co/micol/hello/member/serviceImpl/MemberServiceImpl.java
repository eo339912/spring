package co.micol.hello.member.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.micol.hello.member.map.MemberDAO;
import co.micol.hello.member.service.MemberService;
import co.micol.hello.member.service.MemberVO;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberDAO memberdao; //컨터이너에서 memberDAO에 자동으로 추가
	
	@Override
	public List<MemberVO> getMemberList() {
		return memberdao.getMemberList();
	}

	@Override
	public MemberVO getMemberSelect(MemberVO vo) {
		return null;
	}

	@Override
	public void setMemberInsert(MemberVO vo) {
		memberdao.setMemberInsert(vo);

	}

	@Override
	public void setMemberDelete(MemberVO vo) {
		memberdao.setMemberDelete(vo);

	}

	@Override
	public void setMemberUpdate(MemberVO vo) {
		memberdao.setMemberUpdate(vo);

	}

}
