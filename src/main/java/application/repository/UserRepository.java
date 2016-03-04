package application.repository;

import application.model.User;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Rahul Bhandwalkar on 3/4/2016.
 */

public interface UserRepository extends CrudRepository<User, Long>, JpaSpecificationExecutor<User> {
}
