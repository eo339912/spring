package co.way.board;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Testcontroller {
	@RequestMapping("test2.do")
	public String test(Model model) {
		model.addAttribute("id", "hong");
		model.addAttribute("name", "홍");
		return "test/test2";
	}
	
	@RequestMapping("test.do")
	public ModelAndView test(ModelAndView mv) {
		mv.addObject("id", "park");
		mv.addObject("name", "박");
		mv.setViewName("test/test");
		return mv;
	}
	
	@RequestMapping("/testrequest.do")
	public String testrequest(Model model) {
		return "test/testrequest"; //단순페이지 호출
	}
	
	@RequestMapping("/testrequestresult.do") //request 객체를 통해 전달받음
	public String testrequestresult(HttpServletRequest request, Model model) {
		
		String id = request.getParameter("id");
		String addr = request.getParameter("addr");
		
		model.addAttribute("id", id);
		model.addAttribute("addr", addr);
		
		return "test/testrequestresult";
	}
	
}
