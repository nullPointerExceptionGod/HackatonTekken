package org.hackaton.tekken._5_converters;

import org.hackaton.tekken._1_persistence.model.Question;
import org.hackaton.tekken._1_persistence.model.User;
import org.hackaton.tekken._4_DTO.QuestionDto;
import org.hackaton.tekken._4_DTO.UserDto;
import org.springframework.stereotype.Component;


@Component
public class QuestionToQuestionDto extends AbstractConverter<Question, QuestionDto> {


    /**
     * Converts the question model object into a question DTO
     *
     * @param question the question
     * @return the question DTO
     */


    @Override
    public QuestionDto convert(Question question) {

        QuestionDto questionDto = new QuestionDto();
        questionDto.setId(question.getId());
        questionDto.setDescription(question.getDescription());
        questionDto.setDifficulty(question.getDifficulty());

        return questionDto;
    }
}
