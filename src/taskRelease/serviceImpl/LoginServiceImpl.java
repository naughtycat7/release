package taskRelease.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import taskRelease.bean.User;
import taskRelease.dao.LoginDao;
import taskRelease.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	public LoginDao loginDao;
	
	public User getUser(String name, String pwd) {
		// TODO Auto-generated method stub
		if(name==null || pwd==null)
			return null;
		return loginDao.getUser(name,pwd);
	}
}
