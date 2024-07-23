package com.question.service.implement;

import com.question.entity.Question;
import com.question.repository.QuestionRepository;
import com.question.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    private QuestionRepository questionRepository;
    @Override
    public ResponseEntity<?> saveQuestion(Question question) {
        Question question1 = questionRepository.save(question);
        return new ResponseEntity<>(question1, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<List<Question>> getAllQuiz() {
        List<Question> questions = questionRepository.findAll();
        return new ResponseEntity<>(questions,HttpStatus.OK);
    }

    @Override
    public Optional<Question> getQuiz(Long id) {
        return questionRepository.findById(id);
    }

    @Override
    public List<Question> getQuestionsOfQuiz(Long quizId) {
        return questionRepository.findByQuizId(quizId);
    }


}
