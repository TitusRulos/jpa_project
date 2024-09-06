package com.example.jpa_project.CategoriesCatalog.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.jpa_project.CategoriesCatalog.domain.models.CategoriesCatalog;

@Repository
public interface CategoriesCatalogRepository extends JpaRepository<CategoriesCatalog, Long> {

}
