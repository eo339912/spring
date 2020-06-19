package co.way.board;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	/**
	 * 처음 접속 했을때 보여주는 페이지.
	 */
	@RequestMapping("/main.do")
	public String home(Model model) {
		return "main/main";
	}
	
	@RequestMapping("/login.do")
	public String login(Model model) {
		return "main/login";
	}
	
}
