package org.hackaton.tekken._5_converters;

import org.hackaton.tekken._1_persistence.model.Question;
import org.hackaton.tekken._2_services.QuestionsAnswersService;
import org.hackaton.tekken._4_DTO.QuestionDto;
import org.hackaton.tekken.factories.QuestionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class QuestionDtoToQuestion implements Converter<QuestionDto, Question> {

    private QuestionsAnswersService questionsAnswersService;
    private QuestionFactory questionFactory;

    @Autowired
    public void setQuestionFactory(QuestionFactory questionFactory) {
        this.questionFactory = questionFactory;
    }

    @Autowired
    public void setQuestionsAnswersService(QuestionsAnswersService questionsAnswersService) {
        this.questionsAnswersService = questionsAnswersService;
    }

    @Override
    public Question convert(QuestionDto questionDto) {

       Question question = null;

       question = questionFactory.createQuestion(questionDto.getDifficulty());
       question.setDescription(questionDto.getDescription());

        return question;
    }
}
