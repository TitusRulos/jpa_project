package com.example.jpa_project.Users.domain.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.jpa_project.Users.domain.models.Users;

@Repository
public interface UsersRepository extends CrudRepository<Users, Long> {
    Optional<Users> findByUsername(String username);
}