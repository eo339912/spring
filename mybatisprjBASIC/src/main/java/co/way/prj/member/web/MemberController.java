package co.way.prj.member.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.way.prj.member.service.MemberService;
import co.way.prj.member.service.MemberVO;

@Controller
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	@RequestMapping("/memberlist.do")
	public String memberlist(Model model) {
		List<MemberVO> list = memberService.getMemberList();
		model.addAttribute("member", list);
		return "member/memberlist";
	}
}
