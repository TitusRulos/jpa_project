package com.example.jpa_project.ResponseQuestion.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.jpa_project.ResponseQuestion.domain.models.*;

@Repository
public interface ResponseQuestionRepository extends
        JpaRepository<ResponseQuestion, Long> {

}