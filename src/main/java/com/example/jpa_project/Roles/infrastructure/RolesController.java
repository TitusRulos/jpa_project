package com.example.jpa_project.Roles.infrastructure;

import com.example.jpa_project.Roles.domain.models.Roles;
import com.example.jpa_project.Roles.application.RolesService;
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
@RequestMapping("/roles")
public class RolesController {
    private final RolesService service;

    public RolesController(RolesService service) {
        this.service = service;
    }

    @GetMapping
    public List<Roles> listarPreguntas() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Roles> ver(@PathVariable Long id) {
        Optional<Roles> questionOpt = service.findById(id);
        if (questionOpt.isPresent()) {
            return ResponseEntity.ok(questionOpt.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<?> crear(@Valid @RequestBody Roles question,
            BindingResult resultado) {
        if (resultado.hasFieldErrors()) {
            return validar(resultado);
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(question));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> actualizar(@Valid @RequestBody Roles question,
            BindingResult resultado,
            @PathVariable Long id) {
        if (resultado.hasFieldErrors()) {
            return validar(resultado);
        }
        Optional<Roles> questionOpt = service.update(id, question);
        if (questionOpt.isPresent()) {
            return ResponseEntity.ok(questionOpt.get());
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id) {
        Optional<Roles> questionOpt = service.delete(id);
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