package com.hr_mogador.services;

import com.hr_mogador.entities.Conges;
import com.hr_mogador.repositories.CongesRepository;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class CongesService {

    private final CongesRepository congesRepository;

    public CongesService(CongesRepository congesRepository) {
        this.congesRepository = congesRepository;
    }

    public List<Conges> getAllConges() {
        return congesRepository.findAll();
    }

    public Optional<Conges> getCongesById(Long id) {
        return congesRepository.findById(id);
    }

    public Conges createConges(Conges conges) {
        return congesRepository.save(conges);
    }

    public Conges updateConges(Long id, Conges congesDetails) {
        Conges conges = congesRepository.findById(id).orElse(null);
        if (conges != null) {
            conges.setDebutConges(congesDetails.getDebutConges());
            conges.setFinConges(congesDetails.getFinConges());
            conges.setSoldeConges(congesDetails.getSoldeConges());
            conges.setStatus(congesDetails.getStatus());
            conges.setTypeConges(congesDetails.getTypeConges());
            conges.setEmploye(congesDetails.getEmploye());
            return congesRepository.save(conges);
        }
        return null;
    }

    public void deleteConges(Long id) {
        congesRepository.deleteById(id);
    }
}
