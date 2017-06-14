package dao;

import org.mybatis.spring.SqlSessionTemplate;

public class JeongDaoImp implements JeongDAO{
	private SqlSessionTemplate sqlSession;
	
	public JeongDaoImp() {
	
	}
	
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
	
}
