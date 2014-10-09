package org.hello.ibatis.dao;

import org.hello.ibatis.bean.UserInfo;
/**
 * UserInfo表操作的DAO接口
 * 作者：刘研
 * 时间：2012-12-10
 * 版本：version 1.0
 */
public interface IUserInfoDao {
	UserInfo queryById(int id);
}
