package dao;

import org.mybatis.spring.SqlSessionTemplate;

public class ChoDaoImp implements ChoDAO{
	private SqlSessionTemplate sqlSession;
	
	public ChoDaoImp() {
	
	}
	
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
	
}
