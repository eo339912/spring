package co.way.board;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.way.board.member.service.MemberVO;

@Controller
public class ParamaterController {
	@RequestMapping("/paramtest.do")
	public String paramtest
	(@RequestParam("id") String id, @RequestParam("addr") String addr, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("addr", addr);
		return "test/paramtest";
	}
	
	@RequestMapping("/memberform.do")
	public String memberform(Model model) {
		return "test/memberform";
	}
	
//	@RequestMapping("/memberdata.do") //form의 vo가 자동으로 담김
//	public String memberdata(MemberVO vo, Model model) {
//		model.addAttribute("id", vo.getId());
//		model.addAttribute("pwd", vo.getPwd());
//		model.addAttribute("name", vo.getName());
//		return "test/memberdata";
//	}
	
	@RequestMapping("/memberdata.do") //form의 vo가 자동으로 담김
	public String memberdata(MemberVO vo, Model model) {
		model.addAttribute("vo", vo);
		return "test/memberdata";
	}
}
