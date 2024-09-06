package com.example.jpa_project.Chapter.infrastructure;

import com.example.jpa_project.Chapter.domain.models.Chapter;
import com.example.jpa_project.Chapter.application.ChapterService;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/chapters")
public class ChapterController {
    private final ChapterService chapterService; 

    public ChapterController(ChapterService chapterService) {
        this.chapterService = chapterService;
    }

    // Listar todos los capítulos
    @GetMapping
    public List<Chapter> listarCapitulos() {
        return chapterService.findAll();
    }

    // Ver un capítulo por su ID
    @GetMapping("/{id}")
    public ResponseEntity<Chapter> ver(@PathVariable Long id) {
        Optional<Chapter> chapterOpt = chapterService.findById(id);
        if (chapterOpt.isPresent()) {
            return ResponseEntity.ok(chapterOpt.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }

    // Crear un nuevo capítulo
    @PostMapping
    public ResponseEntity<?> crear(@Valid @RequestBody Chapter chapter, BindingResult resultado) {
        if (resultado.hasFieldErrors()) {
            return validar(resultado);
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(chapterService.save(chapter));
    }

    // Actualizar un capítulo existente
    @PutMapping("/{id}")
    public ResponseEntity<?> actualizar(@Valid @RequestBody Chapter chapter, BindingResult resultado, @PathVariable Long id) {
        if (resultado.hasFieldErrors()) {
            return validar(resultado);
        }
        Optional<Chapter> chapterOpt = chapterService.update(id, chapter);
        if (chapterOpt.isPresent()) {
            return ResponseEntity.ok(chapterOpt.orElseThrow());  // Normalmente se usa 200 OK para actualizaciones
        }
        return ResponseEntity.notFound().build();
    }

    // Eliminar un capítulo por su ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Chapter> eliminar(@PathVariable Long id) {
        Optional<Chapter> chapterOpt = chapterService.delete(id);
        if (chapterOpt.isPresent()) {
            return ResponseEntity.ok(chapterOpt.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }

    // Método privado para manejar las validaciones
    private ResponseEntity<?> validar(BindingResult resultado) {
        Map<String, String> errores = new HashMap<>();
        resultado.getFieldErrors().forEach(err -> {
            errores.put(err.getField(), "El campo " + err.getField() + " " + err.getDefaultMessage());
        });
        return ResponseEntity.badRequest().body(errores);
    }
}
