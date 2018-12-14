package org.hackaton.tekken._1_persistence.dao;

import org.hackaton.tekken._1_persistence.model.Answer;
import org.springframework.stereotype.Repository;

/**
 * A JPA {@link AnswerDao} implementation
 */

@Repository
public class JpaAnswerDao extends JpaGenericDao<Answer> implements AnswerDao {

    public JpaAnswerDao() {
        super(Answer.class);
    }
}
