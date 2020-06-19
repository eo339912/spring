package co.micol.hello.member.map;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import co.micol.hello.member.service.MemberService;
import co.micol.hello.member.service.MemberVO;

@Repository("memberdao")
public class MemberDAO implements MemberService {

	@Autowired
	private JdbcTemplate jdbcTemplate; //jdbcTemplate 객체 자동 주입
	
	private static final String MEMBERALL = "SELECT * FROM MEMBER";
	private static final String MEMBERINSERT = "INSERT INTO MEMBER(id, name, pwd, gender, regdt) VALUES(?,?,?,?,?)";
	private static final String MEMBERUPDATE = "UPDATE MEMBER SET(NAME = ?, PWD = ?, GENDER =?) WHERE ID = ?";
	private static final String MEMBERSELECT = "SELECT * FROM MEMBER WHERE ID = ?";
	//여기 sql 작성
	
	@Override
	public List<MemberVO> getMemberList() {
		return jdbcTemplate.query(MEMBERALL, new MemberRowMapper());
	}
	
	@Override
	public MemberVO getMemberSelect(MemberVO vo) {
		return jdbcTemplate.queryForObject(MEMBERSELECT, new MemberRowMapper(), vo.getId());
	}

	@Override
	public void setMemberInsert(MemberVO vo) {
		jdbcTemplate.update(MEMBERINSERT, vo.getId(), vo.getName(), vo.getPwd(), vo.getGender(), vo.getRegdt());
	}

	@Override
	public void setMemberDelete(MemberVO vo) {
		
		
	}

	@Override
	public void setMemberUpdate(MemberVO vo) {
		jdbcTemplate.update(MEMBERUPDATE, vo.getName(), vo.getPwd(), vo.getGender(), vo.getId());	
	}

	
	
}
