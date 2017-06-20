package controller;

import org.springframework.stereotype.Controller;

import service.KooService;

@Controller
public class KooController {
	private KooService service;
	private String path;

	public KooController() {

	}
	
	public void setService(KooService service) {
		this.service = service;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	public String sasdf(){
		return null;
	}
	
}
