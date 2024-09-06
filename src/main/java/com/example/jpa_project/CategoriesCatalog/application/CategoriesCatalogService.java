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

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
