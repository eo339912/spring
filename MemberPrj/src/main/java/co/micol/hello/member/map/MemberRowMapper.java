package co.micol.hello.member.map;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import co.micol.hello.member.service.MemberVO;



public class MemberRowMapper implements RowMapper<MemberVO> {

	@Override
	public MemberVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		MemberVO vo = new MemberVO();
		vo.setId(rs.getString("id"));
		vo.setName(rs.getString("name"));
		vo.setPwd(rs.getString("pwd"));
		vo.setHobby(rs.getString("hobby"));
		vo.setGender(rs.getString("gender"));
		vo.setReligion(rs.getString("religion"));
		vo.setIntroduction(rs.getString("introduction"));
		vo.setRegdt(rs.getString("regdt"));
		
		
		return vo;
	}
}
