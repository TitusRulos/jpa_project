package com.example.jpa_project.SurveyJson.application;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
// import java.util.List;
// import java.util.Optional;
// import com.example.jpa_project.SurveyJson.domain.models.SurveyJson;
// import com.example.jpa_project.SurveyJson.domain.repository.*;

// @Service
// public class SurveyJsonService {

// @Autowired
// private SurveyJsonRepository repository;

// public List<SurveyJson> findAll() {
// return repository.findAll();
// }

// public Optional<SurveyJson> findById(Long id) {
// return repository.findById(id);
// }

// public SurveyJson save(SurveyJson question) {
// return repository.save(question);
// }

// public Optional<SurveyJson> update(Long id, SurveyJson responseOptions) {
// Optional<SurveyJson> chapterOpt = repository.findById(id);

// if (chapterOpt.isPresent()) {
// SurveyJson existingResponseQuestions = chapterOpt.orElseThrow();
// return Optional.of(repository.save(existingResponseQuestions));
// }

// return chapterOpt;
// }

// public Optional<SurveyJson> delete(Long id) {
// Optional<SurveyJson> chapterOpt = repository.findById(id);
// chapterOpt.ifPresent(chapterItem -> {
// repository.delete(chapterItem);
// });
// return chapterOpt;
// }
// }
