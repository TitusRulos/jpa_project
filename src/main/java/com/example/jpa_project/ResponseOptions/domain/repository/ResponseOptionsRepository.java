package com.example.jpa_project.ResponseOptions.domain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.jpa_project.ResponseOptions.domain.models.*;

import jakarta.validation.Valid;

@Repository
public interface ResponseOptionsRepository extends JpaRepository<ResponseOptions, Long> {

    Optional<ResponseOptions> update(Long id, @Valid ResponseOptions question);

    Optional<ResponseOptions> delete(Long id);
}
