// package com.example.jpa_project.Surveys.application;
// import com.example.jpa_project.Questions.domain.models.Questions;
// import jakarta.persistence.*;
// import java.util.List;
// import com.example.jpa_project.Surveys.domain.models.Surveys;
// import com.example.jpa_project.Surveys.domain.repository.SurveysRepository;


// @Entity
// @Table(name = "surveys")
// public class Surveys {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;

//     @Column(nullable = false)
//     private String title;

//     @Column
//     private String description;

//     @OneToMany(mappedBy = "survey", cascade = CascadeType.ALL)
//     private List<Questions> questions;

//     public Surveys() {}

//     public Surveys(String title, String description) {
//         this.title = title;
//         this.description = description;
//     }

// }