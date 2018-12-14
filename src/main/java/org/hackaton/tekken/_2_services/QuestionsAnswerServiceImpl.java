package org.hackaton.tekken._2_services;

import org.hackaton.tekken._1_persistence.dao.AnswerDao;
import org.hackaton.tekken._1_persistence.dao.QuestionDao;
import org.hackaton.tekken._1_persistence.model.Answer;
import org.hackaton.tekken._1_persistence.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * An {@link QuestionsAnswersService} implementation
 */

@Service
public class QuestionsAnswerServiceImpl implements QuestionsAnswersService {


    private QuestionDao questionDAO;
    private AnswerDao answerDao;

    /**
     *
     * @param questionDAO the question DAO to set
     */

    @Autowired
    public void setQuestionDAO(QuestionDao questionDAO) {
        this.questionDAO = questionDAO;
    }


    @Autowired
    public void setAnswerDao(AnswerDao answerDao) {
        this.answerDao = answerDao;
    }

    /**
     *
     * @see QuestionsAnswersService#getQuestion(Integer)
     */

    @Override
    public Question getQuestion(Integer id) {
        return questionDAO.findById(id);
    }

    @Override
    public Answer getAnswer(Integer id) {
        return answerDao.findById(id);
    }

    @Override
    public List<Question> listQuestions() {
        return questionDAO.findAll();
    }


}
