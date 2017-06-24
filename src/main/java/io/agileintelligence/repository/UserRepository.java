package io.agileintelligence.repository;

import io.agileintelligence.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by carlosarosemena on 2017-06-10.
 */
public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
    User findByEmail(String email);

}
