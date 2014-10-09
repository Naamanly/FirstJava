package test;

import org.hello.ibatis.bean.UserInfo;
import org.hello.ibatis.dao.IUserInfoDao;
import org.hello.ibatis.dao.impl.IUserInfoDaoImpl;

import junit.framework.TestCase;

public class Test extends TestCase{
	public void testFindOne(){
		IUserInfoDao iud = new IUserInfoDaoImpl();
		UserInfo ui = iud.queryById(2);
		System.out.println(ui);
	}
}

