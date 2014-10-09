package org.hello.ibatis.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.hello.ibatis.bean.UserInfo;
import org.hello.ibatis.dao.IUserInfoDao;
import org.hello.ibatis.dao.SessionFactory;

/**
 * UserInfoDao接口实现类
 * 作者：刘研
 * 时间：2012-12-10
 * 版本：version 1.0
 */
public class IUserInfoDaoImpl extends SessionFactory implements IUserInfoDao{
	@Override
	public UserInfo queryById(int id) {
		UserInfo ui = null;
		SqlSession session = super.getSession();
		ui = session.selectOne("org.hello.ibatis.bean.StudentMapper.selectbyid",id);
		session.close();
		return ui;
	}

}
