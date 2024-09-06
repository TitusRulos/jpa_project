package com.example.jpa_project.Surveys.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.example.jpa_project.ResponseQuestion.domain.repository.ResponseQuestionRepository;
import com.example.jpa_project.ResponseQuestion.domain.models.ResponseQuestion;

@Service
public class SurveysService {

    @Autowired
    private ResponseQuestionRepository repository;

    public List<ResponseQuestion> findAll() {
        return repository.findAll();
    }

    public Optional<ResponseQuestion> findById(Long id) {
        return repository.findById(id);
    }

    public ResponseQuestion save(ResponseQuestion question) {
        return repository.save(question);
    }

    public Optional<ResponseQuestion> update(Long id, ResponseQuestion responseOptions) {
        Optional<ResponseQuestion> chapterOpt = repository.findById(id);

        if (chapterOpt.isPresent()) {
            ResponseQuestion existingResponseQuestions = chapterOpt.orElseThrow();

            existingResponseQuestions.setOptionText(responseOptions.getOptionText());
            existingResponseQuestions.setSubresponseOptions(responseOptions.getSubresponseOptions());
            existingResponseQuestions.setValue(responseOptions.getValue());
            return Optional.of(repository.save(existingResponseQuestions));
        }

        return chapterOpt;
    }

    public Optional<ResponseQuestion> delete(Long id) {
        Optional<ResponseQuestion> chapterOpt = repository.findById(id);
        chapterOpt.ifPresent(chapterItem -> {
            repository.delete(chapterItem);
        });
        return chapterOpt;
    }
}
