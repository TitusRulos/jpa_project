package com.example.jpa_project.dto;

import com.example.jpa_project.Users.domain.models.RolEnum;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    Long id;
    String username;
    String Email;
    RolEnum role;
}