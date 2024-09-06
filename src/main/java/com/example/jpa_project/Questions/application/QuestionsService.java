package com.example.jpa_project.Questions.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import com.example.jpa_project.Questions.domain.models.Questions;
import com.example.jpa_project.Questions.domain.repository.QuestionsRepository;

@Service
public class QuestionsService {

    @Autowired
    private QuestionsRepository questionsRepository;

    public List<Questions> findAll() {
        return questionsRepository.findAll();
    }

    public Optional<Questions> findById(Long id) {
        return questionsRepository.findById(id);
    }

    public Questions save(Questions question) {
        return questionsRepository.save(question);
    }

    public Optional<Questions> update(Long id, Questions questions) {
        Optional<Questions> chapterOpt = questionsRepository.findById(id);

        if (chapterOpt.isPresent()) {
            Questions existingQuestions = chapterOpt.orElseThrow();
            existingQuestions.setQuestionText(questions.getQuestionText());
            existingQuestions.setQuestionType(questions.getQuestionType());
            existingQuestions.setResponseOptions(questions.getResponseOptions());

            return Optional.of(questionsRepository.save(existingQuestions));
        }

        return chapterOpt;
    }

    public Optional<Questions> delete(Long id) {
        Optional<Questions> chapterOpt = questionsRepository.findById(id);
        chapterOpt.ifPresent(chapterItem -> {
            questionsRepository.delete(chapterItem);
        });
        return chapterOpt;
    }
}
