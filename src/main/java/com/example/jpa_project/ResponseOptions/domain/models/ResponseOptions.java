package com.example.jpa_project.ResponseOptions.domain.models;

import com.example.jpa_project.Questions.domain.models.Questions;
import jakarta.persistence.*;
import lombok.*;
import com.example.jpa_project.ResponseQuestion.domain.models.ResponseQuestion;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "response_option")
public class ResponseOptions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String optionText;

    @Column
    private Integer value;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Questions question;

    @ManyToOne
    @JoinColumn(name = "response_question_id") // Esta columna referencia a ResponseQuestion
    private ResponseQuestion responseQuetion; // Esta propiedad debe existir
}