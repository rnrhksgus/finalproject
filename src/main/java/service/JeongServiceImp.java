package service;

import dao.JeongDAO;

public class JeongServiceImp implements JeongService {
	private JeongDAO dao;

	public JeongServiceImp() {

	}

	public void setDao(JeongDAO dao) {
		this.dao = dao;
	}
	
}
