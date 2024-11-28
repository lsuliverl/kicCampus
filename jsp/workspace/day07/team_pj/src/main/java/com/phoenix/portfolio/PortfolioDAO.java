package com.phoenix.portfolio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.phoenix.mybatis.SqlMapConfig;


public class PortfolioDAO {
	SqlSessionFactory factory = SqlMapConfig.getFactory();
	SqlSession sqlSession;
	
	public PortfolioDAO() {
		sqlSession = factory.openSession(true);
	}
	
	public boolean insertPortfolio(PortfolioDTO pdto) {
		boolean result = false;
		
		if(sqlSession.insert("User.insertPortfolio", pdto) == 1) {
			// insert 성공
			result = true;
		}
		
		return result;
	}
}
