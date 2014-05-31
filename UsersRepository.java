package $PACKAGE.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import $PACKAGE.domain.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users,String> {
  
}
