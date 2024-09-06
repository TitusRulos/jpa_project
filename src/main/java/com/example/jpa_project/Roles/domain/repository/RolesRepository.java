package com.example.jpa_project.Roles.domain.repository;
// Roles.java
public class RolesRepository{
    private Long id;
    private String roleName;
    private String description;

    // Constructors, getters, and setters
    public RolesRepository() {}

    public RolesRepository(Long id, String roleName, String description) {
        this.id = id;
        this.roleName = roleName;
        this.description = description;
    }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getRoleName() { return roleName; }
    public void setRoleName(String roleName) { this.roleName = roleName; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}