package signup.services;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import signup.domain.Users;
import signup.repository.AboutDao;

@Service("aboutService")
@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
public class AboutServiceImpl implements AboutService {

	private final Log log = LogFactory.getLog ( AboutServiceImpl.class );

	@Autowired
	private AboutDao aboutDao;

	public AboutServiceImpl() {}

	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void addUser(Users users) {
		if ( log.isDebugEnabled() )
        	log.debug ( users.toString() );

		aboutDao.saveUser ( users );
	}

	
}
