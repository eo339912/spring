package co.micol.hello.member.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.micol.hello.member.service.MemberService;
import co.micol.hello.member.service.MemberVO;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;	//memberServiceImpl을 자동주입한다.
	
	@RequestMapping("/memberlist.do")
	public String memberlist(Model model) {
		List<MemberVO> list = memberService.getMemberList();
		model.addAttribute("member",list);
		return "member/memberlist"; //url주소 : redirect:list.do
	}
	
	@RequestMapping("/memberinsertform.do")
	public String memberinsertform() {
		return "member/memberinsertform"; 
	}
	
	   @RequestMapping("/memberinsert.do")
	   public String memberinsert(MemberVO vo, Model model) {
	      memberService.setMemberInsert(vo);
	      return "redirect:memberlist.do"; //insert가 정상적 동작했으면 memberlist.do로 가라, view resolve를 선택하지 않고 바로 페이지전달
	   }
}
