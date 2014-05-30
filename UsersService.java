package $PACKAGE.service;

import $PACKAGE.data.UsersRepository;
import $PACKAGE.domain.Users;

@Transactional
@Service("usersService")
public class UsersService {

	@Autowired
	private UsersRepository dao;
	
	public void insert(Users users){
		dao.save(users);
	}

	public void update(Users users){
		dao.save(users);
	}

	public void delete(Users users){
		dao.delete(users);
	}

	public List<Users> findAll(){
		return dao.findAll();
	}

	public Users findById(String id){
		return dao.findOne(id);
	}
	
}
