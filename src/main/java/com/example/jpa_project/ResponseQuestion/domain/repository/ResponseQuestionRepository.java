package com.example.jpa_project.ResponseQuestion.domain.repository;
// ResponseQuestion.java
public class ResponseQuestionRepository {
    private Long id;
    private Long questionId;
    private String response;

    // Constructors, getters, and setters
    public ResponseQuestionRepository() {}

    public ResponseQuestionRepository(Long id, Long questionId, String response) {
        this.id = id;
        this.questionId = questionId;
        this.response = response;
    }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getQuestionId() { return questionId; }
    public void setQuestionId(Long questionId) { this.questionId = questionId; }
    public String getResponse() { return response; }
    public void setResponse(String response) { this.response = response; }
}