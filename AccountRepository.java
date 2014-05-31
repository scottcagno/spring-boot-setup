package $PACKAGE.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import $PACKAGE.domain.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {
	@Query("SELECT a FROM Account a WHERE LOWER(a.user.username)=LOWER(:username)")
	public Account findByUsername(@Param("username") String username);
}
