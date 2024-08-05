package com.hr_mogador.controlers;

import com.hr_mogador.entities.Conges;
import com.hr_mogador.services.CongesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/conges")
public class CongesController {

    private final CongesService congesService;

    public CongesController(CongesService congesService) {
        this.congesService = congesService;
    }

    @GetMapping
    public List<Conges> getAllConges() {
        return congesService.getAllConges();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Conges> getCongesById(@PathVariable Long id) {
        Optional<Conges> conges = congesService.getCongesById(id);
        return conges.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Conges createConges(@RequestBody Conges conges) {
        return congesService.createConges(conges);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Conges> updateConges(@PathVariable Long id, @RequestBody Conges congesDetails) {
        Conges updatedConges = congesService.updateConges(id, congesDetails);
        return updatedConges != null ? ResponseEntity.ok(updatedConges) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteConges(@PathVariable Long id) {
        congesService.deleteConges(id);
        return ResponseEntity.noContent().build();
    }
}
