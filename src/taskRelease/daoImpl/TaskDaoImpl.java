package taskRelease.daoImpl;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

import taskRelease.bean.Task;
import taskRelease.dao.TaskDao;

@Component
public class TaskDaoImpl extends HibernateDaoSupport implements TaskDao{
	
	public List<Task> selectNewTask(){
		// TODO Auto-generated method stub
		final String hql="from Task as a order by a.releaseTime DESC";
		return getHibernateTemplate().executeFind(new HibernateCallback() {  
			 public Object doInHibernate(final Session session) throws HibernateException, SQLException {  
				 Query query = session.createQuery(hql);  
//				 query.setParameter(0, userId);  
				 query.setMaxResults(10);  
				 query.setFirstResult(0);  
				 return query.list();  
				 }  
			 });
	}
	
	public List<Task> selectFinishTask(){
		// TODO Auto-generated method stub
		final String hql="from Task as a where a.finishTime<>0 order by a.finishTime ASC";
		return getHibernateTemplate().executeFind(new HibernateCallback() {  
			 public Object doInHibernate(final Session session) throws HibernateException, SQLException {  
				 Query query = session.createQuery(hql);  
//				 query.setParameter(0, userId);  
				 query.setMaxResults(10);  
				 query.setFirstResult(0);  
				 return query.list();  
				 }  
			 });
	}
	
	@Resource(name="sessionFactory")
	private void setMySessionFactory(SessionFactory sessionFactory){
	  super.setSessionFactory(sessionFactory);
	}
}
