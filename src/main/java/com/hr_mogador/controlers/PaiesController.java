package com.hr_mogador.controlers;

import com.hr_mogador.entities.Paies;
import com.hr_mogador.services.PaiesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/paies")
public class PaiesController {

    private final PaiesService paiesService;

    public PaiesController(PaiesService paiesService) {
        this.paiesService = paiesService;
    }

    @GetMapping
    public List<Paies> getAllPaies() {
        return paiesService.getAllPaies();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Paies> getPaiesById(@PathVariable Long id) {
        Optional<Paies> paies = paiesService.getPaiesById(id);
        return paies.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Paies createPaies(@RequestBody Paies paies) {
        return paiesService.createPaies(paies);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Paies> updatePaies(@PathVariable Long id, @RequestBody Paies paiesDetails) {
        Paies updatedPaies = paiesService.updatePaies(id, paiesDetails);
        return updatedPaies != null ? ResponseEntity.ok(updatedPaies) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePaies(@PathVariable Long id) {
        paiesService.deletePaies(id);
        return ResponseEntity.noContent().build();
    }
}
