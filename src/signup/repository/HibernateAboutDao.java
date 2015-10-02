package signup.repository;

import java.util.Date;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import signup.domain.Users;

@Repository("aboutDao")
public class HibernateAboutDao implements AboutDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void saveUser ( Users users ) {
		sessionFactory.getCurrentSession().saveOrUpdate ( users );
	}

	@SuppressWarnings("unchecked")
	public List<Users> getAllEvents() {
		return (List<Users>) sessionFactory.getCurrentSession().createCriteria ( Users.class ).list();
	}

	
}
