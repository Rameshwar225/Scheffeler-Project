package Backend.Interface;

import org.springframework.data.repository.CrudRepository;

import Backend.Entity.User;

public interface UserRepository extends CrudRepository<User, Long> {
	 User findByUsernameAndPassword(String username, String password);

}