package com.example.jpa_project.Users.infrastructure;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa_project.dto.*;

import com.example.jpa_project.Users.domain.repository.UsersRepository;

import com.example.jpa_project.Users.domain.models.Users;
import com.example.jpa_project.security.jwt.JwtUtils;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/auth") // Uso de minúsculas para consistencia
@RequiredArgsConstructor
public class AuthController {

    private final UsersRepository repository;
    private final JwtUtils jwt;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@Valid @RequestBody LoginRequest loginRequest) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getEmail()));

        UserDetails user = repository.findByUsername(loginRequest.getUsername())
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));

        String token = jwt.getToken(user);
        return ResponseEntity.ok(AuthResponse.builder().token(token).build());
    }

    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest registerRequest) {
        Users tercero = Users.builder()
                .id(registerRequest.getId())
                .username(registerRequest.getUsername())
                .email(passwordEncoder.encode(registerRequest.getEmail()))
                .role(registerRequest.getRole())
                .build();

        repository.save(tercero);

        String token = jwt.getToken(tercero);
        return ResponseEntity.ok(AuthResponse.builder().token(token).build());
    }
}