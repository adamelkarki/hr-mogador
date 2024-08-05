package com.hr_mogador.services;

import com.hr_mogador.entities.Paies;
import com.hr_mogador.repositories.PaiesRepository;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class PaiesService {

    private final PaiesRepository paiesRepository;

    public PaiesService(PaiesRepository paiesRepository) {
        this.paiesRepository = paiesRepository;
    }

    public List<Paies> getAllPaies() {
        return paiesRepository.findAll();
    }

    public Optional<Paies> getPaiesById(Long id) {
        return paiesRepository.findById(id);
    }

    public Paies createPaies(Paies paies) {
        return paiesRepository.save(paies);
    }

    public Paies updatePaies(Long id, Paies paiesDetails) {
        Paies paies = paiesRepository.findById(id).orElse(null);
        if (paies != null) {
            paies.setMontantSalaire(paiesDetails.getMontantSalaire());
            paies.setDatePaiement(paiesDetails.getDatePaiement());
            paies.setPrimes(paiesDetails.getPrimes());
            paies.setDeductions(paiesDetails.getDeductions());
            paies.setEmploye(paiesDetails.getEmploye());
            return paiesRepository.save(paies);
        }
        return null;
    }

    public void deletePaies(Long id) {
        paiesRepository.deleteById(id);
    }
}
