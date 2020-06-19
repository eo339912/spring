package co.micol.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 처음 접속되는 페이지 설정
 */
@Controller
public class HomeController {
	@RequestMapping("/main.do")
	public String home(Model model) {
		return "main/home";
	}
}