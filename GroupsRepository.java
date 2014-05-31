package $PACKAGE.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import $PACKAGE.domain.Groups;

@Repository
public interface GroupsRepository extends JpaRepository<Groups,Long> {
  
}
