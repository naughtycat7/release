package taskRelease.dao;

import java.util.List;

import taskRelease.bean.UserInfo;

public interface UserInfoDao {
	public UserInfo selectUserInfoById(Integer id);
}