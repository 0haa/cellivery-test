package cellivery.front.model;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

@Component
public class FrontDAO {
	
	private final SqlSession sqlSession;
	
	public FrontDAO(SqlSession sqlSession) 
	{
		this.sqlSession = sqlSession;
	}
	private String NS = "frontMapper";

	
	public int test() {
		return sqlSession.selectOne(NS + ".test");
	}

}
