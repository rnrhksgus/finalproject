package controller;

import org.springframework.stereotype.Controller;

import service.JeongService;

@Controller
public class JeongController {
	private JeongService service;
	private String path;

	public JeongController() {

	}

	public void setService(JeongService service) {
		this.service = service;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
