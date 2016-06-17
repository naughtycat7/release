package taskRelease.service;

import taskRelease.bean.User;

public interface LoginService {
	public User getUser(String name,String pwd);
}
