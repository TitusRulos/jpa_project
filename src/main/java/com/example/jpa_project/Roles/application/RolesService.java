// package com.example.jpa_project.Roles.application;

// import com.example.jpa_project.Roles.domain.repository.RolesRepository;
// import com.example.jpa_project.Roles.domain.models.Roles;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
// import java.util.List;
// import java.util.Optional;
// import com.example.jpa_project.Roles.domain.repository.RolesRepository;
// import com.example.jpa_project.Roles.domain.models.Roles;


// @Service
// public class RolesService {

//     @Autowired
//     private RolesRepository rolesRepository;

//     public List<Roles> findAll() {
//         return rolesRepository.findAll();
//     }

//     public Optional<Roles> findById(Long id) {
//         return rolesRepository.findById(id);
//     }

//     public Roles save(Roles role) {
//         return rolesRepository.save(role);
//     }

//     public void deleteById(Long id) {
//         rolesRepository.deleteById(id);
//     }
// }
