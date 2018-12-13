package org.hackaton.tekken._5_converters;

import org.hackaton.tekken._1_persistence.model.Answer;
import org.hackaton.tekken._2_services.QuestionsAnswersService;
import org.hackaton.tekken._4_DTO.AnswerDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class AnswerDtoToAnswer implements Converter<AnswerDto, Answer> {

    private QuestionsAnswersService questionsAnswersService;

    @Override
    public Answer convert(AnswerDto source) {
        return null;
    }
}
