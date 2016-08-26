package hello.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by rex on 8/24/16.
 */
public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findByLastName(String lastName);
}
