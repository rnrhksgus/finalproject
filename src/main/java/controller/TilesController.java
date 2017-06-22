package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//http://localhost:8090/mytravel/index.do

@Controller
public class TilesController {

	@RequestMapping("/index.do")
	public String indexProcess() {
		return "index";
	}// end process()
	
	@RequestMapping("/login.do")
	public String loginProcess() {
		return "login";
	}// end process()
	
	@RequestMapping("/register.do")
	public String registerProcess() {
		return "register";
	}// end process()
	
	@RequestMapping("/mypage.do")
	public String mypageProcess() {
		return "mypage";
	}// end process()
	
}