package com.example.jpa_project.ResponseOptions.domain.repository;
// ResponseOptions.java
public class ResponseOptionsRepository {
    private Long id;
    private String optionText;
    private Integer value;

    // Constructors, getters, and setters
    public ResponseOptionsRepository() {

    }

    public ResponseOptionsRepository(Long id, String optionText, Integer value) {
        this.id = id;
        this.optionText = optionText;
        this.value = value;
    }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getOptionText() { return optionText; }
    public void setOptionText(String optionText) { this.optionText = optionText; }
    public Integer getValue() { return value; }
    public void setValue(Integer value) { this.value = value; }
}