package com.example.jpa_project.Chapter.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import com.example.jpa_project.Chapter.domain.repository.ChapterRepository;
import com.example.jpa_project.Chapter.domain.models.Chapter;


@Service
public class ChapterService {

    @Autowired
    private ChapterRepository chapterRepository;

    public List<Chapter> findAll() {
        return chapterRepository.findAll();
    }

    public Optional<Chapter> findById(Long id) {
        return chapterRepository.findById(id);
    }

    public Chapter save(Chapter chapter) {
        return chapterRepository.save(chapter);
    }

    
    public Optional<Chapter> update(Long id, Chapter chapter) {
        Optional<Chapter> chapterOpt = chapterRepository.findById(id);

        if (chapterOpt.isPresent()) {
            Chapter existingChapter = chapterOpt.orElseThrow();
            existingChapter.setContent(chapter.getContent());
            existingChapter.setName(chapter.getName());
            return Optional.of(chapterRepository.save(existingChapter));
        }

        return chapterOpt;
    }


    public Optional<Chapter> delete(Long id) {
        Optional<Chapter> chapterOpt = chapterRepository.findById(id);
        chapterOpt.ifPresent(chapterItem ->{
            chapterRepository.delete(chapterItem);
        });
        return chapterOpt;
    }
}
