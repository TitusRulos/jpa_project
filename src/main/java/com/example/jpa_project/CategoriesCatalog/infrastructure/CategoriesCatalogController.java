package com.example.jpa_project.CategoriesCatalog.infrastructure;

// import
// com.example.jpa_project.CategoriesCatalog.domain.models.CategoriesCatalog;
// import
// com.example.jpa_project.CategoriesCatalog.application.CategoriesCatalogService;
// import org.springframework.web.bind.annotation.*;
// import org.springframework.http.ResponseEntity;
// import org.springframework.validation.BindingResult;
// import jakarta.validation.Valid;
// import org.springframework.http.HttpStatus;

// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;
// import java.util.Optional;

// @RestController
// @RequestMapping("/chapters")
// public class CategoriesCatalogController {
// private final CategoriesCatalogService service;

// public CategoriesCatalogController(CategoriesCatalogService service) {
// this.service = service;
// }

// // Listar todos los capítulos
// @GetMapping
// public List<CategoriesCatalog> listarCapitulos() {
// return service.findAll();
// }

// // Ver un capítulo por su ID
// @GetMapping("/{id}")
// public ResponseEntity<CategoriesCatalog> ver(@PathVariable Long id) {
// Optional<CategoriesCatalog> chapterOpt = service.findById(id);
// if (chapterOpt.isPresent()) {
// return ResponseEntity.ok(chapterOpt.orElseThrow());
// }
// return ResponseEntity.notFound().build();
// }

// // Crear un nuevo capítulo
// @PostMapping
// public ResponseEntity<?> crear(@Valid @RequestBody CategoriesCatalog chapter,
// BindingResult resultado) {
// if (resultado.hasFieldErrors()) {
// return validar(resultado);
// }
// return ResponseEntity.status(HttpStatus.CREATED).body(service.save(chapter));
// }

// // Actualizar un capítulo existente
// @PutMapping("/{id}")
// public ResponseEntity<?> actualizar(@Valid @RequestBody CategoriesCatalog
// question,
// BindingResult resultado,
// @PathVariable Long id) {
// if (resultado.hasFieldErrors()) {
// return validar(resultado);
// }
// Optional<CategoriesCatalog> questionOpt = service.update(id, question);
// if (questionOpt.isPresent()) {
// return ResponseEntity.ok(questionOpt.get());
// }
// return ResponseEntity.notFound().build();
// }

// // Eliminar un capítulo por su ID
// @DeleteMapping("/{id}")
// public ResponseEntity<CategoriesCatalog> eliminar(@PathVariable Long id) {
// Optional<CategoriesCatalog> chapterOpt = service.delete(id);
// if (chapterOpt.isPresent()) {
// return ResponseEntity.ok(chapterOpt.orElseThrow());
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
