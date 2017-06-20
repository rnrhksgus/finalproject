package controller;

import org.springframework.stereotype.Controller;

import service.LimService;

@Controller
public class LimController {
	private LimService service;
	private String path;

	public LimController() {

	}

	public void setService(LimService service) {
		this.service = service;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
