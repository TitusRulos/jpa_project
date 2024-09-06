// package com.example.jpa_project.ResponseOptions.application;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
// import java.util.List;
// import java.util.Optional;
// import com.example.jpa_project.ResponseOptions.domain.models.ResponseOptions;
// import com.example.jpa_project.ResponseOptions.domain.repository.ResponseOptionsRepository;

// @Service
// public class ResponseOptionsService {

//     @Autowired
//     private ResponseOptionsRepository responseOptionsRepository;

//     public List<ResponseOptions> findAll() {
//         return responseOptionsRepository.findAll();
//     }

//     public Optional<ResponseOptions> findById(Long id) {
//         return responseOptionsRepository.findById(id);
//     }

//     public ResponseOptions save(ResponseOptions responseOptions) {
//         return responseOptionsRepository.save(responseOptions);
//     }

//     public void deleteById(Long id) {
//         responseOptionsRepository.deleteById(id);
//     }
// }
