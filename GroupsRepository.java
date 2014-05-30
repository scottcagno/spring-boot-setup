package $PACKAGE.data;

import $PACKAGE.domain.Users;

@Repository
public interface GroupsRepository extends JpaRepository<Users,String> {}
