package org.hello.ibatis.dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SessionFactory {
	public SqlSession getSession(){
		String resource = "org/hello/ibatis/bean/ibatis-config.xml";  
	    SqlSessionFactory sqlSessionFactory = null;  
	    InputStream inputStream = null;
	    try {
			inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			return sqlSessionFactory.openSession();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	    return null;
	}
}
