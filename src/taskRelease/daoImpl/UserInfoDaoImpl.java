package taskRelease.daoImpl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

import redis.clients.jedis.Jedis;
import taskRelease.bean.UserInfo;
import taskRelease.dao.UserInfoDao;

@Component
public class UserInfoDaoImpl extends HibernateDaoSupport implements UserInfoDao {

	public UserInfo selectUserInfoById(Integer uid) {
		// TODO Auto-generated method stub
		String hql = "from UserInfo as a where a.uid="+uid;
		List<UserInfo> res=getHibernateTemplate().find(hql);
		if(res.size()>0)
			return res.get(0);
		return null;
	}
	
	@Resource(name="sessionFactory")
	private void setMySessionFactory(SessionFactory sessionFactory){
	  super.setSessionFactory(sessionFactory);
	 }
}
