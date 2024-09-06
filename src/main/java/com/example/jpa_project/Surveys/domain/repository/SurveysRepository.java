package com.example.jpa_project.Surveys.domain.repository;
// Surveys.java
public class SurveysRepository {
    private Long id;
    private String title;
    private String description;

    // Constructors, getters, and setters
    public SurveysRepository() {}

    public SurveysRepository(Long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}