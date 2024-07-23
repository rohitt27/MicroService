package com.question.controller;

import com.question.entity.Question;
import com.question.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/question")
public class QuestionController {
    @Autowired
    private QuestionService questionService;
    @PostMapping("addQuestion")
    public ResponseEntity<?> saveQuiz(@RequestBody Question question){
        return questionService.saveQuestion(question);
    }
    @GetMapping("getQuestion/{id}")
    public Optional<Question> getId(@PathVariable Long id){
        return questionService.getQuiz(id);
    }
    @GetMapping("getQuestion")
    public ResponseEntity<List<Question>> getQuizes(){
        return questionService.getAllQuiz();
    }
    @GetMapping("quiz/{quizId}")
    public List<Question> getQuestionsOfQuiz(@PathVariable Long quizId){
        return questionService.getQuestionsOfQuiz(quizId);
    }
}
