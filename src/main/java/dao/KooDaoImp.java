package dao;

import org.mybatis.spring.SqlSessionTemplate;

public class KooDaoImp implements KooDAO{
	private SqlSessionTemplate sqlSession;

	public KooDaoImp() {
	
	}
	
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

}
