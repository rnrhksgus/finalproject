package dao;

import org.mybatis.spring.SqlSessionTemplate;

public class LimDaoImp implements LImDAO{
	private SqlSessionTemplate sqlSession;

	public LimDaoImp() {

	}

	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

}
