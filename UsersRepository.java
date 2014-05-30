package $PACKAGE.data;

import $PACKAGE.domain.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users,String> {}
