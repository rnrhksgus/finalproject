package service;

import dao.ChoDAO;

public class ChoServiceImp implements ChoService{
	private ChoDAO dao;
	
	public ChoServiceImp() {
	
	}
	
	public void setDao(ChoDAO dao) {
		this.dao = dao;
	}
	
}
