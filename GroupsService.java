package $PACKAGE.service;

import $PACKAGE.data.GroupsRepository;
import $PACKAGE.domain.Groups;

@Transactional
@Service("groupsService")
public class GroupsService {

	@Autowired
	private GroupsRepository dao;
	
	public void insert(Groups groups){
		dao.save(users);
	}

	public void update(Groups groups){
		dao.save(users);
	}

	public void delete(Groups groups){
		dao.delete(groups);
	}

	public List<Groups> findAll(){
		return dao.findAll();
	}

	public Users findById(Long id){
		return dao.findOne(id);
	}
}
