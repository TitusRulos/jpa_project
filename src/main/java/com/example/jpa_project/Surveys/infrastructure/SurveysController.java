// package com.example.jpa_project.Surveys.infrastructure;

// import com.example.jpa_project.Surveys.domain.models.Surveys;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;


// import java.util.List;
// import java.util.Optional;

// @RestController
// @RequestMapping("/surveys")
// public class SurveysController {

//     @Autowired
//     private Surveys surveysRepository;

//     // Crear una nueva encuesta
//     @PostMapping
//     public Surveys createSurvey(@RequestBody Surveys survey) {
//         return surveysRepository.save(survey);
//     }

//     // Obtener todas las encuestas
//     @GetMapping
//     public List<Surveys> getAllSurveys() {
//         return surveysRepository.findAll();
//     }

//     // Obtener una encuesta por ID
//     @GetMapping("/{id}")
//     public ResponseEntity<Surveys> getSurveyById(@PathVariable Long id) {
//         Optional<Surveys> survey = surveysRepository.findById(id);
//         return survey.map(ResponseEntity::ok)
//                 .orElseGet(() -> ResponseEntity.notFound().build());
//     }

//     // Actualizar una encuesta
//     @PutMapping("/{id}")
//     public ResponseEntity<Surveys> updateSurvey(@PathVariable Long id, @RequestBody Surveys surveyDetails) {
//         Optional<Surveys> survey = surveysRepository.findById(id);
//         if (survey.isPresent()) {
//             Surveys updatedSurvey = survey.get();
//             updatedSurvey.setTitle(surveyDetails.getTitle());
//             updatedSurvey.setDescription(surveyDetails.getDescription());
//             return ResponseEntity.ok(surveysRepository.save(updatedSurvey));
//         } else {
//             return ResponseEntity.notFound().build();
//         }
//     }

//     // Eliminar una encuesta
//     @DeleteMapping("/{id}")
//     public ResponseEntity<Void> deleteSurvey(@PathVariable Long id) {
//         if (surveysRepository.existsById(id)) {
//             surveysRepository.deleteById(id);
//             return ResponseEntity.noContent().build();
//         } else {
//             return ResponseEntity.notFound().build();
//         }
//     }
// }
