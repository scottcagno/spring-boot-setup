package $PACKAGE.service;

import $PACKAGE.data.AccountRepository;
import $PACKAGE.domain.Account;

@Transactional
@Service("accountService")
public class AccountService {
	
	@Autowired
	private AccountRepository dao;

	public void insert(Account account) {
		dao.save(account);
	}

	public void update(Account account) {
		dao.save(account);
	}

	public void delete(Account account) {
		dao.delete(account);
	}

	public List<Account> findAll() {
		return dao.findAll();
	}

	public Account findById(Long id) {
		return dao.findOne(id);
	}
	
	public Account findByUsername(String username) {
		return dao.findByUsername(username);
	}

}
