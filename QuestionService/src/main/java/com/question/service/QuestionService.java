package com.question.service;

import com.question.entity.Question;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface QuestionService {
    ResponseEntity<?> saveQuestion(Question question);
    ResponseEntity<List<Question>> getAllQuiz();
    Optional<Question> getQuiz(Long id);
    List<Question> getQuestionsOfQuiz(Long quizId);
}
