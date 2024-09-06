package com.example.jpa_project.ResponseQuestion.infrastructure;

import com.example.jpa_project.ResponseQuestion.domain.models.ResponseQuestion;
import com.example.jpa_project.ResponseQuestion.application.ResponseQuestionService;
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
@RequestMapping("/response-questions")
public class ResponseQuestionController {
    private final ResponseQuestionService service;

    public ResponseQuestionController(ResponseQuestionService service) {
        this.service = service;
    }

    @GetMapping
    public List<ResponseQuestion> listarPreguntas() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseQuestion> ver(@PathVariable Long id) {
        Optional<ResponseQuestion> questionOpt = service.findById(id);
        if (questionOpt.isPresent()) {
            return ResponseEntity.ok(questionOpt.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<?> crear(@Valid @RequestBody ResponseQuestion question,
            BindingResult resultado) {
        if (resultado.hasFieldErrors()) {
            return validar(resultado);
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(question));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> actualizar(@Valid @RequestBody ResponseQuestion question,
            BindingResult resultado,
            @PathVariable Long id) {
        if (resultado.hasFieldErrors()) {
            return validar(resultado);
        }
        Optional<ResponseQuestion> questionOpt = service.update(id, question);
        if (questionOpt.isPresent()) {
            return ResponseEntity.ok(questionOpt.get());
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id) {
        Optional<ResponseQuestion> questionOpt = service.delete(id);
        if (questionOpt.isPresent()) {
            return ResponseEntity.ok(questionOpt.get());
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