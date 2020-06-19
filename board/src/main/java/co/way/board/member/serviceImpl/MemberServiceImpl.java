package co.way.board.member.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.way.board.member.map.MemberDAO;
import co.way.board.member.service.MemberService;
import co.way.board.member.service.MemberVO;

@Service("memberservice")
public class MemberServiceImpl implements MemberService {
	
	@Autowired //di : container에 있는 dao를 가져옴 (의존성)
	private MemberDAO dao; //private MemberDAO dao = new MemberDAO();
	
	@Override
	public List<MemberVO> getMemberList() {
		return dao.getMemberList();
	}

	@Override
	public MemberVO getMemberSelect(MemberVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMemberInsert(MemberVO vo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setMemberDelete(MemberVO vo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setMemberUpdate(MemberVO vo) {
		// TODO Auto-generated method stub

	}

}
