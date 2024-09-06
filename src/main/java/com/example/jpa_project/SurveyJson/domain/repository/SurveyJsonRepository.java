package com.example.jpa_project.SurveyJson.domain.repository;
// SurveyJson.java
public class SurveyJsonRepository {
    private Long id;
    private String jsonContent;

    // Constructors, getters, and setters
    public SurveyJsonRepository() {}

    public SurveyJsonRepository(Long id, String jsonContent) {
        this.id = id;
        this.jsonContent = jsonContent;
    }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getJsonContent() { return jsonContent; }
    public void setJsonContent(String jsonContent) { this.jsonContent = jsonContent; }
}