package org.hackaton.tekken._3_controllersREST;


import org.hackaton.tekken._1_persistence.model.Answer;
import org.hackaton.tekken._1_persistence.model.Question;
import org.hackaton.tekken._2_services.QuestionsAnswersService;
import org.hackaton.tekken._4_DTO.AnswerDto;
import org.hackaton.tekken._5_converters.AnswerDtoToAnswer;
import org.hackaton.tekken._5_converters.AnswerToAnswerDto;
import org.hackaton.tekken._5_converters.QuestionDtoToQuestion;
import org.hackaton.tekken._5_converters.QuestionToQuestionDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * A Rest controller responsible for {@link Question,Answer} responsible for CRUD operations
 */

@RestController
@RequestMapping("api/user")
public class QuestionAnswerControllerREST {

    private QuestionsAnswersService questionsAnswersService;

    private QuestionDtoToQuestion questionDtoToQuestion;
    private QuestionToQuestionDto questionToQuestionDto;
    private AnswerToAnswerDto answerToAnswerDto;
    private AnswerDtoToAnswer answerDtoToAnswer;

    @Autowired
    public void setQuestionsAnswersService(QuestionsAnswersService questionsAnswersService) {
        this.questionsAnswersService = questionsAnswersService;
    }

    @Autowired
    public void setQuestionDtoToQuestion(QuestionDtoToQuestion questionDtoToQuestion) {
        this.questionDtoToQuestion = questionDtoToQuestion;
    }

    @Autowired
    public void setQuestionToQuestionDto(QuestionToQuestionDto questionToQuestionDto) {
        this.questionToQuestionDto = questionToQuestionDto;
    }

    @Autowired
    public void setAnswerToAnswerDto(AnswerToAnswerDto answerToAnswerDto) {
        this.answerToAnswerDto = answerToAnswerDto;
    }

    @Autowired
    public void setAnswerDtoToAnswer(AnswerDtoToAnswer answerDtoToAnswer) {
        this.answerDtoToAnswer = answerDtoToAnswer;
    }

    /**
     * Retrieves a representation of the given Question answers
     *
     * @param cid the question id
     * @return the response entity
     */
    @RequestMapping(method = RequestMethod.GET, path = "/{cid}/question")
    public ResponseEntity<List<AnswerDto>> listQuestionAnswers(@PathVariable Integer cid) {

        Question question = questionsAnswersService.getQuestion(cid);

        if (question == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        List<AnswerDto> answerDtos = new ArrayList<>();
        for (Answer answer : question.getAnswers()) {
            answerDtos.add(answerToAnswerDto.convert(answer));
        }

        return new ResponseEntity<>(answerDtos, HttpStatus.OK);
    }
}
