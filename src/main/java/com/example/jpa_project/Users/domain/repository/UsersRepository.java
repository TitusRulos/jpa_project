package com.example.jpa_project.Users.domain.repository;
// Users.java
public class UsersRepository {
    private Long id;
    private String username;
    private String email;

    // Constructors, getters, and setters
    public UsersRepository() {}

    public UsersRepository(Long id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
