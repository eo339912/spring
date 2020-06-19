package co.way.board.member.map;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.way.board.member.service.MemberService;
import co.way.board.member.service.MemberVO;

@Repository("memberdao")
public class MemberDAO implements MemberService {
	
	@Autowired //자동으로 주입하라.
	private DataSource datasource;
	private Connection con;
	private PreparedStatement psmt;
	private ResultSet rs;
	
	private static final String MEMBER_ALL = "SELECT * FROM MEMBER";
	
	@Override
	public List<MemberVO> getMemberList() {
		List<MemberVO> list = new ArrayList<MemberVO>();
		MemberVO vo;
		try {
			con = datasource.getConnection();
			psmt = con.prepareStatement(MEMBER_ALL);
			rs = psmt.executeQuery();
			while(rs.next()) {
				vo = new MemberVO();
				vo.setId(rs.getString("id"));
				vo.setName(rs.getString("name"));
				vo.setGender(rs.getString("gender"));
				vo.setHobby(rs.getString("hobby"));
				vo.setIntroduction(rs.getString("introduction"));
				vo.setPwd(rs.getString("pwd"));
				vo.setRegdt(rs.getDate("regdt"));
				vo.setReligion(rs.getString("religion"));
				list.add(vo);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
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
