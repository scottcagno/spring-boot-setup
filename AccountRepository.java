package $PACKAGE.data;

import $PACKAGE.domain.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {
	@Query("SELECT a FROM Account a WHERE LOWER(a.user.username)=LOWER(:username)")
	public Account findByUsername(@Param("username") String username);
}
