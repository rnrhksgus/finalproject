package controller;

import org.springframework.stereotype.Controller;

import service.SongService;

@Controller
public class SongController {
	private SongService service;
	private String path;

	public SongController() {

	}

	public void setService(SongService service) {
		this.service = service;
	}

	public void setPath(String path) {
		this.path = path;
	}

} //end class()
