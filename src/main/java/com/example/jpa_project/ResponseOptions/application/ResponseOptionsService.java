package com.example.jpa_project.ResponseOptions.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import com.example.jpa_project.ResponseOptions.domain.models.ResponseOptions;
import com.example.jpa_project.ResponseOptions.domain.repository.ResponseOptionsRepository;

@Service
public class ResponseOptionsService {

    @Autowired
    private ResponseOptionsRepository repository;

    public List<ResponseOptions> findAll() {
        return repository.findAll();
    }

    public Optional<ResponseOptions> findById(Long id) {
        return repository.findById(id);
    }

    public ResponseOptions save(ResponseOptions question) {
        return repository.save(question);
    }

    public Optional<ResponseOptions> update(Long id, ResponseOptions responseOptions) {
        Optional<ResponseOptions> chapterOpt = repository.findById(id);

        if (chapterOpt.isPresent()) {
            ResponseOptions existingResponseOptions = chapterOpt.orElseThrow();
            existingResponseOptions.setOptionText(responseOptions.getOptionText());
            existingResponseOptions.setQuestion(responseOptions.getQuestion());
            existingResponseOptions.setResponseQuetion(responseOptions.getResponseQuetion());
            existingResponseOptions.setValue(responseOptions.getValue());
            return Optional.of(repository.save(existingResponseOptions));
        }

        return chapterOpt;
    }

    public Optional<ResponseOptions> delete(Long id) {
        Optional<ResponseOptions> chapterOpt = repository.findById(id);
        chapterOpt.ifPresent(chapterItem -> {
            repository.delete(chapterItem);
        });
        return chapterOpt;
    }
}
