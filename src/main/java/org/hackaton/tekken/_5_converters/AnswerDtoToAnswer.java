package org.hackaton.tekken._5_converters;

import org.hackaton.tekken._1_persistence.model.Answer;
import org.hackaton.tekken._2_services.QuestionsAnswersService;
import org.hackaton.tekken._4_DTO.AnswerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class AnswerDtoToAnswer implements Converter<AnswerDto, Answer> {

    private QuestionsAnswersService questionsAnswersService;

    @Autowired
    public void setQuestionsAnswersService(QuestionsAnswersService questionsAnswersService) {
        this.questionsAnswersService = questionsAnswersService;
    }

    @Override
    public Answer convert(AnswerDto answerDto) {

        Answer answer = (answerDto.getId() != null ? questionsAnswersService.getAnswer(answerDto.getId()) : new Answer());

        answer.setDescription(answerDto.getDescription());
        answer.setValidation(answerDto.getValidation());

        return answer;

    }
}
