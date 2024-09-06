package com.example.jpa_project.CategoriesCatalog.application;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import com.example.jpa_project.CategoriesCatalog.domain.repository.CategoriesCatalogRepository;
import com.example.jpa_project.CategoriesCatalog.domain.models.CategoriesCatalog;

@Service
public class CategoriesCatalogService {

    private final CategoriesCatalogRepository repository;

    public CategoriesCatalogService(CategoriesCatalogRepository categoriesCatalogRepository) {
        this.repository = categoriesCatalogRepository;
    }

    public List<CategoriesCatalog> findAll() {
        return repository.findAll();
    }

    public Optional<CategoriesCatalog> findById(Long id) {
        return repository.findById(id);
    }

    public CategoriesCatalog save(CategoriesCatalog category) {
        return repository.save(category);
    }

    public Optional<CategoriesCatalog> update(Long id, CategoriesCatalog questions) {
        Optional<CategoriesCatalog> chapterOpt = repository.findById(id);

        if (chapterOpt.isPresent()) {
            CategoriesCatalog existingQuestions = chapterOpt.orElseThrow();

            return Optional.of(repository.save(existingQuestions));
        }

        return chapterOpt;
    }

    public Optional<CategoriesCatalog> delete(Long id) {
        Optional<CategoriesCatalog> chapterOpt = repository.findById(id);
        chapterOpt.ifPresent(chapterItem -> {
            repository.delete(chapterItem);
        });
        return chapterOpt;
    }
}
