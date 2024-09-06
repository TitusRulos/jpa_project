package com.example.jpa_project.UsersRoles.domain.repository;
// UsersRoles.java
public class UsersRolesRepository {
    private Long userId;
    private Long roleId;

    // Constructors, getters, and setters
    public UsersRolesRepository() {}

    public UsersRolesRepository(Long userId, Long roleId) {
        this.userId = userId;
        this.roleId = roleId;
    }

    // Getters and setters
    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }
    public Long getRoleId() { return roleId; }
    public void setRoleId(Long roleId) { this.roleId = roleId; }
}