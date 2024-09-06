package com.example.jpa_project.ResponseQuestion.domain.models;

import com.example.jpa_project.SubresponseOptions.domain.models.SubresponseOptions;
import jakarta.persistence.*;
import lombok.*;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "response_quetion")
public class ResponseQuetion{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String optionText;

    @Column
    private Integer value;

    @ManyToOne
    @JoinColumn(name = "subresponse_option_id")
    private SubresponseOptions subresponseOptions;

    

}

