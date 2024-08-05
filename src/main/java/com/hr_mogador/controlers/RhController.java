package com.hr_mogador.controlers;

import com.hr_mogador.entities.Rh;
import com.hr_mogador.services.RhService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/rh")
public class RhController {

    private final RhService rhService;

    public RhController(RhService rhService) {
        this.rhService = rhService;
    }

    @GetMapping
    public List<Rh> getAllRh() {
        return rhService.getAllRh();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Rh> getRhById(@PathVariable Long id) {
        Optional<Rh> rh = rhService.getRhById(id);
        return rh.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Rh createRh(@RequestBody Rh rh) {
        return rhService.createRh(rh);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Rh> updateRh(@PathVariable Long id, @RequestBody Rh rhDetails) {
        Rh updatedRh = rhService.updateRh(id, rhDetails);
        return updatedRh != null ? ResponseEntity.ok(updatedRh) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRh(@PathVariable Long id) {
        rhService.deleteRh(id);
        return ResponseEntity.noContent().build();
    }
}
