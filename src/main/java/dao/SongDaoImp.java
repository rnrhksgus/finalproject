package dao;

import org.mybatis.spring.SqlSessionTemplate;

public class SongDaoImp implements SongDAO{
	private SqlSessionTemplate sqlSession;

	public SongDaoImp() {

	}

	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
	
}
