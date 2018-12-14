package org.hackaton.tekken._5_converters;

import org.hackaton.tekken._1_persistence.model.Answer;
import org.hackaton.tekken._1_persistence.model.Question;
import org.hackaton.tekken._4_DTO.AnswerDto;
import org.hackaton.tekken._4_DTO.QuestionDto;
import org.springframework.stereotype.Component;

@Component
public class AnswerToAnswerDto extends AbstractConverter<Answer, AnswerDto> {


    /**
     * Converts the answer model object into a answer DTO
     *
     * @param answer the question
     * @return the answer DTO
     */

    @Override
    public AnswerDto convert(Answer answer) {

        AnswerDto answerDto = new AnswerDto();
        answerDto.setId(answer.getId());
        answerDto.setDescription(answer.getDescription());
        answerDto.setValidation(answer.getValidation());

        return answerDto;
    }
}

