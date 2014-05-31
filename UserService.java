package $PACKAGE.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import $PACKAGE.data.UserRepository;
import $PACKAGE.domain.User;

@Transactional
@Service("userService")
public class UserService {

	@Autowired
	private UserRepository dao;
	
	public void insert(User user) {
		dao.save(user);
	}

	public void update(User user){
		dao.save(user);
	}

	public void delete(User user){
		dao.delete(user);
	}

	public List<User> findAll(){
		return dao.findAll();
	}

	public User findById(Long id){
		return dao.findOne(id);
	}
	
	public boolean exists(String username) {
		return dao.exists(username) > 0;
	}
	
}
