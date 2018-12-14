package org.hackaton.tekken._3_controllersREST;


import org.hackaton.tekken._1_persistence.model.Answer;
import org.hackaton.tekken._1_persistence.model.Question;
import org.hackaton.tekken._1_persistence.model.User;
import org.hackaton.tekken._2_services.QuestionsAnswersService;
import org.hackaton.tekken._2_services.UserService;
import org.hackaton.tekken._4_DTO.AnswerDto;
import org.hackaton.tekken._4_DTO.QuestionDto;
import org.hackaton.tekken._5_converters.AnswerDtoToAnswer;
import org.hackaton.tekken._5_converters.AnswerToAnswerDto;
import org.hackaton.tekken._5_converters.QuestionDtoToQuestion;
import org.hackaton.tekken._5_converters.QuestionToQuestionDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * A Rest controller responsible for {@link Question,Answer} responsible for CRUD operations
 */

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/user")
public class QuestionAnswerControllerREST {

    private QuestionsAnswersService questionsAnswersService;
    private UserService userService;

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

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    /**
     * Retrieves a representation of the given Question answers
     *
     * @param uid the user id
     * @param qid the question id
     * @return the response entity
     */
    @RequestMapping(method = RequestMethod.GET, path = "/{uid}/question/{qid}")
    public ResponseEntity<List<AnswerDto>> listAnswersByQuestion(@PathVariable Integer uid, @PathVariable Integer qid) {

        User user = userService.get(uid);


        if (user == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        Question question = questionsAnswersService.getQuestion(qid);

        if (question == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        List<AnswerDto> answerDtos = new ArrayList<>();
        for (Answer answer : question.getAnswers()) {
            answerDtos.add(answerToAnswerDto.convert(answer));
        }

        return new ResponseEntity<>(answerDtos, HttpStatus.OK);

    }

    /**
     * Retrieves a representation of the given Questions
     *
     * @param cid the user id
     * @return list of questions
     */

    @RequestMapping(method = RequestMethod.GET, path = "/{cid}/question")
    public ResponseEntity<List<QuestionDto>> listQuestions(@PathVariable Integer cid) {

        User user = userService.get(cid);

        if (user == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        List<QuestionDto> questionDtos = new ArrayList<>();

        for (Question question : questionsAnswersService.listQuestions()) {
            questionDtos.add(questionToQuestionDto.convert(question));
        }

        return new ResponseEntity<>(questionDtos, HttpStatus.OK);
    }
}
