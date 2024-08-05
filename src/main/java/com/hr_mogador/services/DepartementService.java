package com.hr_mogador.services;

import com.hr_mogador.entities.Departement;
import com.hr_mogador.repositories.DepartementRepository;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class DepartementService {

    private final DepartementRepository departementRepository;

    public DepartementService(DepartementRepository departementRepository) {
        this.departementRepository = departementRepository;
    }

    public List<Departement> getAllDepartements() {
        return departementRepository.findAll();
    }

    public Optional<Departement> getDepartementById(Long id) {
        return departementRepository.findById(id);
    }

    public Departement createDepartement(Departement departement) {
        return departementRepository.save(departement);
    }

    public Departement updateDepartement(Long id, Departement departementDetails) {
        Departement departement = departementRepository.findById(id).orElse(null);
        if (departement != null) {
            departement.setNomDepartement(departementDetails.getNomDepartement());
            return departementRepository.save(departement);
        }
        return null;
    }

    public void deleteDepartement(Long id) {
        departementRepository.deleteById(id);
    }
}

