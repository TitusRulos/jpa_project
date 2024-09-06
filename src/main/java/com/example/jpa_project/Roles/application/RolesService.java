package com.example.jpa_project.Roles.application;

import com.example.jpa_project.Roles.domain.repository.RolesRepository;
import com.example.jpa_project.Roles.domain.models.Roles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class RolesService {

    @Autowired
    private RolesRepository repository;

    public List<Roles> findAll() {
        return repository.findAll();
    }

    public Optional<Roles> findById(Long id) {
        return repository.findById(id);
    }

    public Roles save(Roles question) {
        return repository.save(question);
    }

    public Optional<Roles> update(Long id, Roles responseOptions) {
        Optional<Roles> chapterOpt = repository.findById(id);

        if (chapterOpt.isPresent()) {
            Roles existingResponseQuestions = chapterOpt.orElseThrow();
            return Optional.of(repository.save(existingResponseQuestions));
        }

        return chapterOpt;
    }

    public Optional<Roles> delete(Long id) {
        Optional<Roles> chapterOpt = repository.findById(id);
        chapterOpt.ifPresent(chapterItem -> {
            repository.delete(chapterItem);
        });
        return chapterOpt;
    }
}
