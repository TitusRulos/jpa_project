package com.example.jpa_project.Questions.domain.models;

import com.example.jpa_project.ResponseOptions.domain.models.ResponseOptions;
import com.example.jpa_project.Surveys.domain.models.Surveys;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "questions")
public class Questions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String questionText;

    @Column(nullable = false)
    private String questionType;

    @ManyToOne
    @JoinColumn(name = "survey_id")
    private Surveys survey;

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
    private List<ResponseOptions> responseOptions;
}