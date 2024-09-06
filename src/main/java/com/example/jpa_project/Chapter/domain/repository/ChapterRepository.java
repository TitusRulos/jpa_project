package com.example.jpa_project.Chapter.domain.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.jpa_project.Chapter.domain.models.*;

@Repository
public interface ChapterRepository extends JpaRepository<Chapter, Long> {
    
}

