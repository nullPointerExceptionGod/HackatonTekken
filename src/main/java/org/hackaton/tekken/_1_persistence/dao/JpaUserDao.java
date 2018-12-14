package org.hackaton.tekken._1_persistence.dao;

import org.hackaton.tekken._1_persistence.model.User;
import org.springframework.stereotype.Repository;

/**
 * A JPA {@link UserDao} implementation
 */

@Repository
public class JpaUserDao extends JpaGenericDao<User> implements UserDao {

    public JpaUserDao() {
        super(User.class);
    }
}
