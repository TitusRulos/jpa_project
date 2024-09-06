package com.example.jpa_project.Roles.domain.models;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;
import com.example.jpa_project.Users.domain.models.Users;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "rol")
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String roleName;

    @Column
    private String description;

    @ManyToMany(mappedBy = "roles")
    private List<Users> users;
}
