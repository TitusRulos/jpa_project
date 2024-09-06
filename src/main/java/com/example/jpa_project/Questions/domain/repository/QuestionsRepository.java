package com.example.jpa_project.Questions.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.jpa_project.Questions.domain.models.*;

@Repository
public interface QuestionsRepository extends JpaRepository<Questions, Long> {

}
