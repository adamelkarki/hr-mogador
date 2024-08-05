package com.hr_mogador.services;

import com.hr_mogador.entities.Rh;
import com.hr_mogador.repositories.RhRepository;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class RhService {

    private final RhRepository rhRepository;

    public RhService(RhRepository rhRepository) {
        this.rhRepository = rhRepository;
    }

    public List<Rh> getAllRh() {
        return rhRepository.findAll();
    }

    public Optional<Rh> getRhById(Long id) {
        return rhRepository.findById(id);
    }

    public Rh createRh(Rh rh) {
        return rhRepository.save(rh);
    }

    public Rh updateRh(Long id, Rh rhDetails) {
        Rh rh = rhRepository.findById(id).orElse(null);
        if (rh != null) {
            rh.setPrenomRH(rhDetails.getPrenomRH());
            rh.setNomRH(rhDetails.getNomRH());
            rh.setEmailRH(rhDetails.getEmailRH());
            rh.setCountry(rhDetails.getCountry());
            return rhRepository.save(rh);
        }
        return null;
    }

    public void deleteRh(Long id) {
        rhRepository.deleteById(id);
    }
}
