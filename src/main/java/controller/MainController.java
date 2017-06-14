package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//http://localhost:8090/mytravel/main.do

@Controller
public class MainController {
	
	
	
	@RequestMapping("/main.do")
	public String mainGet(){
		return "main";
	}
	
	public String mainPost(){
		return "";
	}
	
}
