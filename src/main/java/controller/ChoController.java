package controller;

import org.springframework.stereotype.Controller;

import service.ChoService;

@Controller
public class ChoController {
	private ChoService service;
	private String path;

	public ChoController() {

	}

	public void setService(ChoService service) {
		this.service = service;
	}

	public void setPath(String path) {
		this.path = path;
	}

}// end classsdfdsaa
