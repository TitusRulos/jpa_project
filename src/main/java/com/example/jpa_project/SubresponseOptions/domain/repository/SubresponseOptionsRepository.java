package com.example.jpa_project.SubresponseOptions.domain.repository;
// SubresponseOptions.java
public class SubresponseOptionsRepository {
    private Long id;
    private String suboptionText;
    private Integer subvalue;

    // Constructors, getters, and setters
    public SubresponseOptionsRepository() {}

    public SubresponseOptionsRepository(Long id, String suboptionText, Integer subvalue) {
        this.id = id;
        this.suboptionText = suboptionText;
        this.subvalue = subvalue;
    }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getSuboptionText() { return suboptionText; }
    public void setSuboptionText(String suboptionText) { this.suboptionText = suboptionText; }
    public Integer getSubvalue() { return subvalue; }
    public void setSubvalue(Integer subvalue) { this.subvalue = subvalue; }
}