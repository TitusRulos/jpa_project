// package com.example.jpa_project.ResponseOptions.infrastructure;

// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;
// import com.example.jpa_project.ResponseOptions.domain.models.ResponseOptions;
// import
// com.example.jpa_project.ResponseOptions.domain.repository.ResponseOptionsRepository;
// import lombok.RequiredArgsConstructor;
// import org.springframework.validation.BindingResult;
// import jakarta.validation.Valid;
// import org.springframework.http.HttpStatus;
// import java.util.HashMap;
// import java.util.Map;
// import java.util.List;
// import java.util.Optional;

// @RestController
// @RequestMapping("/response-options")
// @RequiredArgsConstructor
// public class ResponseOptionsController {

// private final ResponseOptionsRepository service;

// // Listar todos los capítulos
// @GetMapping
// public List<ResponseOptions> listarCapitulos() {
// return service.findAll();
// }

// // Ver un capítulo por su ID
// @GetMapping("/{id}")
// public ResponseEntity<ResponseOptions> ver(@PathVariable Long id) {
// Optional<ResponseOptions> chapterOpt = service.findById(id);
// if (chapterOpt.isPresent()) {
// return ResponseEntity.ok(chapterOpt.orElseThrow());
// }
// return ResponseEntity.notFound().build();
// }

// // Crear un nuevo capítulo
// @PostMapping
// public ResponseEntity<?> crear(@Valid @RequestBody ResponseOptions chapter,
// BindingResult resultado) {
// if (resultado.hasFieldErrors()) {
// return validar(resultado);
// }
// return ResponseEntity.status(HttpStatus.CREATED).body(service.save(chapter));
// }

// @PutMapping("/{id}")
// public ResponseEntity<?> actualizar(@Valid @RequestBody ResponseOptions
// question,
// BindingResult resultado,
// @PathVariable Long id) {
// if (resultado.hasFieldErrors()) {
// return validar(resultado);
// }
// Optional<ResponseOptions> questionOpt = service.update(id, question);
// if (questionOpt.isPresent()) {
// return ResponseEntity.ok(questionOpt.get());
// }
// return ResponseEntity.notFound().build();
// }

// @DeleteMapping("/{id}")
// public ResponseEntity<?> eliminar(@PathVariable Long id) {
// Optional<ResponseOptions> questionOpt = service.delete(id);
// if (questionOpt.isPresent()) {
// return ResponseEntity.ok(questionOpt.get());
// }
// return ResponseEntity.notFound().build();
// }

// // Método privado para manejar las validaciones
// private ResponseEntity<?> validar(BindingResult resultado) {
// Map<String, String> errores = new HashMap<>();
// resultado.getFieldErrors().forEach(err -> {
// errores.put(err.getField(), "El campo " + err.getField() + " " +
// err.getDefaultMessage());
// });
// return ResponseEntity.badRequest().body(errores);
// }
// }

// package com.example.jpa_project.ResponseOptions.infrastructure;

/*
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.jpa_project.ResponseOptions.domain.models.ResponseOptions;
import com.example.jpa_project.ResponseOptions.domain.repository.ResponseOptionsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.BindingResult;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/response-options")
@RequiredArgsConstructor
public class ResponseOptionsController {

    private final ResponseOptionsRepository service;

    // Listar todas las opciones de respuesta
    @GetMapping
    public List<ResponseOptions> listarOpciones() {
        return service.findAll();
    }

    // Ver una opción de respuesta por su ID
    @GetMapping("/{id}")
    public ResponseEntity<ResponseOptions> ver(@PathVariable Long id) {
        Optional<ResponseOptions> responseOpt = service.findById(id);
        if (responseOpt.isPresent()) {
            return ResponseEntity.ok(responseOpt.get());
        }
        return ResponseEntity.notFound().build();
    }

    // Crear una nueva opción de respuesta
    @PostMapping
    public ResponseEntity<?> crear(@Valid @RequestBody ResponseOptions responseOption, BindingResult resultado) {
        if (resultado.hasFieldErrors()) {
            return validar(resultado);
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(responseOption));
    }

    // Actualizar una opción de respuesta
    @PutMapping("/{id}")
    public ResponseEntity<?> actualizar(@Valid @RequestBody ResponseOptions responseOption, BindingResult resultado, @PathVariable Long id) {
        if (resultado.hasFieldErrors()) {
            return validar(resultado);
        }
        Optional<ResponseOptions> responseOpt = service.update(id, responseOption);
        if (responseOpt.isPresent()) {
            return ResponseEntity.ok(responseOpt.get());
        }
        return ResponseEntity.notFound().build();
    }

    // Eliminar una opción de respuesta
    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id) {
        Optional<ResponseOptions> responseOpt = service.delete(id);
        if (responseOpt.isPresent()) {
            return ResponseEntity.ok(responseOpt.get());
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
*/