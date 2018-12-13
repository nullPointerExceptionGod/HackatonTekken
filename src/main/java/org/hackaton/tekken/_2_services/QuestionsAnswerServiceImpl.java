package org.hackaton.tekken._2_services;

import org.hackaton.tekken._1_persistence.dao.QuestionDAO;
import org.hackaton.tekken._1_persistence.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * An {@link QuestionsAnswersService} implementation
 */

@Service
public class QuestionsAnswerServiceImpl implements QuestionsAnswersService {


    public QuestionDAO questionDAO;

    /**
     *
     * @param questionDAO the question DAO to set
     */

    @Autowired
    public void setQuestionDAO(QuestionDAO questionDAO) {
        this.questionDAO = questionDAO;
    }

    /**
     *
     * @see QuestionsAnswersService#get(Integer)
     */

    @Override
    public Question get(Integer id) {
        return questionDAO.findById(id);
    }


}
