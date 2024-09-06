package com.example.jpa_project.Roles.domain.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.jpa_project.Roles.domain.models.Roles;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository extends JpaRepository<Roles, Long> {

    List<Roles> findAll();

    Optional<Roles> findById(Long id);

    // Roles save(Roles question);

    void delete(Roles chapterItem);

}