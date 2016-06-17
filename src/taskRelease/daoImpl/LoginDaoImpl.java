package taskRelease.daoImpl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

import taskRelease.bean.User;
import taskRelease.dao.LoginDao;

@Component
public class LoginDaoImpl extends HibernateDaoSupport implements LoginDao{
	
	public User getUser(String name, String pwd) {
		// TODO Auto-generated method stub
		String hql = "from User as a where a.name='"+name+"' and a.pwd='"+pwd+"'";
		List<User> res = getHibernateTemplate().find(hql);
		if(res.size()>0)
			return res.get(0);
		return null;
	}
	
	@Resource(name="sessionFactory")
	private void setMySessionFactory(SessionFactory sessionFactory){
	  super.setSessionFactory(sessionFactory);
	}
}
