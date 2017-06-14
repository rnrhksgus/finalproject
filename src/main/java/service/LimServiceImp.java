package service;

import dao.LImDAO;

public class LimServiceImp implements LimService {
	private LImDAO dao;

	public LimServiceImp() {

	}

	public void setDao(LImDAO dao) {
		this.dao = dao;
	}

}
