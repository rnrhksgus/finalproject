package service;

import dao.SongDAO;

public class SongServiceImp implements SongService {
	private SongDAO dao;

	public SongServiceImp() {

	}

	public void setDao(SongDAO dao) {
		this.dao = dao;
	}

}
