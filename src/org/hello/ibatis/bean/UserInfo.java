package org.hello.ibatis.bean;
/**
 * 用户信息实体类
 * 作者：刘研
 * 时间：2012-12-10
 * 版本：version 1.0
 */
public class UserInfo {
	private int id;
	private String userName;
	private int age;
	
	public UserInfo(){}
	
	public UserInfo(String userName,int age){
		this.userName=userName;
		this.age=age;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "id:"+id+" name:"+userName+" age:"+age;
	}
	
	
}
