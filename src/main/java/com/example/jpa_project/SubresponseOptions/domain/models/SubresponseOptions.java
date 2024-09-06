package com.example.jpa_project.SubresponseOptions.domain.models;
 import jakarta.persistence.*;
 import com.example.jpa_project.ResponseOptions.domain.models.ResponseOptions;
 import lombok.*;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "subresponse_option")
public class SubresponseOptions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String suboptionText;

    @Column
    private Integer subvalue;

    @ManyToOne
    @JoinColumn(name = "response_option_id")
    private ResponseOptions responseOption;
}