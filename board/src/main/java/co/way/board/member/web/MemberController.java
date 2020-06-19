package co.way.board.member.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.way.board.member.service.MemberService;
import co.way.board.member.service.MemberVO;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberservice;
	//private MemberService memberservice = new MemberService();
	
	@RequestMapping("/memberlist.do")
	public String memberlist(Model model) {
		List<MemberVO> list = memberservice.getMemberList();
		model.addAttribute("list", list); //request.setAttribute 역할
		return "member/memberlist";
	};
	
}
