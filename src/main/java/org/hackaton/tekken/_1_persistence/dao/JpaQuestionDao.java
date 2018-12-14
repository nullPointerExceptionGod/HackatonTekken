package org.hackaton.tekken._1_persistence.dao;

import org.hackaton.tekken._1_persistence.model.Question;
import org.springframework.stereotype.Repository;

/**
 * A JPA {@link QuestionDao} implementation
 */

@Repository
public class JpaQuestionDao extends JpaGenericDao<Question> implements QuestionDao {

    public JpaQuestionDao() {
        super(Question.class);
    }
}
