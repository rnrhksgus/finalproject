package service;

import dao.KooDAO;

public class KooServiceImp implements KooService{
	private KooDAO dao;
	
	public KooServiceImp() {
	
	}
	
	public void setDao(KooDAO dao) {
		this.dao = dao;
	}
	
}
