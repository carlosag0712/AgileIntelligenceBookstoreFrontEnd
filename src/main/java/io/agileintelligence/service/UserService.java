package io.agileintelligence.service;

import io.agileintelligence.domain.User;
import io.agileintelligence.domain.security.PasswordResetToken;
import io.agileintelligence.domain.security.UserRole;

import java.util.Set;

/**
 * Created by carlosarosemena on 2017-06-12.
 */
public interface UserService {

    PasswordResetToken getPasswordResetToken(final String token);
    void createPasswordResetTokenForUser(final User user, final String token);
    User findByUsername(String username);
    User findByEmail(String email);

    User createUser(User user, Set<UserRole> userRoleSet) throws Exception;

    User save(User user);






}
