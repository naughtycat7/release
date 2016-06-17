package taskRelease.dao;

import taskRelease.bean.User;

public interface LoginDao {
	public User getUser(String name, String pwd);
}
