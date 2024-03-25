package hei.school.soratra.endpoint.rest.controller.health;

import hei.school.soratra.PojaGenerated;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@PojaGenerated
@RestController
@AllArgsConstructor
public class HealthSoratraController {
    @PutMapping("/soratra/{id}")
    public ResponseEntity<Void> putSoratra(@PathVariable String id, @RequestBody String poeticPhrase) {
        // Vérification si l'ID est présent
        if (id == null || id.isEmpty()) {
            return ResponseEntity.badRequest().build();
        }

        // Vérification si la phrase poétique est présente
        if (poeticPhrase == null || poeticPhrase.isEmpty()) {
            return ResponseEntity.badRequest().build();
        }

        // Traitement de la phrase poétique - dans ce cas, aucune action n'est effectuée

        // Retourner un HTTP 200 OK avec un corps vide
        return ResponseEntity.ok().build();
    }

    @GetMapping("/soratra/{id}")
    public ResponseEntity<SoratraResponse> getSoratra(@PathVariable String id) {
        // Vérification si l'ID est présent
        if (id == null || id.isEmpty()) {
            return ResponseEntity.badRequest().build();
        }

        // Récupération des URL signées (supposons que vous avez une méthode pour cela)
        String originalUrl = getOriginalUrl(id);
        String transformedUrl = getTransformedUrl(id);

        // Création de la réponse
        SoratraResponse response = new SoratraResponse(originalUrl, transformedUrl);

        // Retourner un HTTP 200 OK avec la réponse en JSON
        return ResponseEntity.ok().body(response);
    }

    private String getOriginalUrl(String id) {
        return "https://original.url/" + id;
    }

    private String getTransformedUrl(String id) {
        return "https://transformed.url/" + id;
    }
}
