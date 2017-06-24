package io.agileintelligence.repository;

import io.agileintelligence.domain.security.Role;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by carlosarosemena on 2017-06-13.
 */
public interface RoleRepository extends CrudRepository<Role, Long> {
    Role findByName(String name);
}
