package com.example.jpa_project.SubresponseOptions.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import com.example.jpa_project.SubresponseOptions.domain.models.SubresponseOptions;
import com.example.jpa_project.SubresponseOptions.domain.repository.SubresponseOptionsRepository;

@Service
public class SubresponseOptionsService {

    @Autowired
    private SubresponseOptionsRepository repository;

    public List<SubresponseOptions> findAll() {
        return repository.findAll();
    }

    public Optional<SubresponseOptions> findById(Long id) {
        return repository.findById(id);
    }

    public SubresponseOptions save(SubresponseOptions question) {
        return repository.save(question);
    }

    public Optional<SubresponseOptions> update(Long id, SubresponseOptions responseOptions) {
        Optional<SubresponseOptions> chapterOpt = repository.findById(id);

        if (chapterOpt.isPresent()) {
            SubresponseOptions existingResponseQuestions = chapterOpt.orElseThrow();
            return Optional.of(repository.save(existingResponseQuestions));
        }

        return chapterOpt;
    }

    public Optional<SubresponseOptions> delete(Long id) {
        Optional<SubresponseOptions> chapterOpt = repository.findById(id);
        chapterOpt.ifPresent(chapterItem -> {
            repository.delete(chapterItem);
        });
        return chapterOpt;
    }
}
