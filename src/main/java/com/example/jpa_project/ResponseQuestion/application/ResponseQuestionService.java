// package com.example.jpa_project.ResponseQuestion.application;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
// import java.util.List;
// import java.util.Optional;

// import
// com.example.jpa_project.ResponseQuestion.domain.repository.ResponseQuestionRepository;
// import
// com.example.jpa_project.ResponseQuestion.domain.models.ResponseQuetion;

// @Service
// public class ResponseQuestionService {

// @Autowired
// private ResponseQuestionRepository responseQuestionRepository;

// public List<ResponseQuestion> findAll() {
// return responseQuestionRepository.findAll();
// }

// public Optional<ResponseQuestion> findById(Long id) {
// return responseQuestionRepository.findById(id);
// }

// public save(ResponseQuestions responseQuestion) {
// return responseQuestionRepository.save(responseQuestion);
// }

// public Optional<Chapter> update(Long id, Chapter chapter) {
// Optional<Chapter> chapterOpt = chapterRepository.findById(id);

// if (chapterOpt.isPresent()) {
// Chapter existingChapter = chapterOpt.orElseThrow();
// existingChapter.setContent(chapter.getContent());
// existingChapter.setName(chapter.getName());
// return Optional.of(chapterRepository.save(existingChapter));
// }

// return chapterOpt;
// }

// public Optional<Chapter> delete(Long id) {
// Optional<Chapter> chapterOpt = chapterRepository.findById(id);
// chapterOpt.ifPresent(chapterItem -> {
// chapterRepository.delete(chapterItem);
// });
// return chapterOpt;
// }
// }
