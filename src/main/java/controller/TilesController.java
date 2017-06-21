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
	
	@RequestMapping("/menu1.do")
	public String menu1Process() {
		return "menu1";
	}// end process()
	
	@RequestMapping("/menu2.do")
	public String menu2Process() {
		return "menu2";
		
	}// end process()
}