package $PACKAGE.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import $PACKAGE.data.GroupsRepository;
import $PACKAGE.domain.Groups;

@Transactional
@Service("groupsService")
public class GroupsService {

	@Autowired
	private GroupsRepository dao;
	
	public void insert(Groups groups){
		dao.save(groups);
	}

	public void update(Groups groups){
		dao.save(groups);
	}

	public void delete(Groups groups){
		dao.delete(groups);
	}

	public List<Groups> findAll(){
		return dao.findAll();
	}

	public Groups findById(Long id){
		return dao.findOne(id);
	}
}
