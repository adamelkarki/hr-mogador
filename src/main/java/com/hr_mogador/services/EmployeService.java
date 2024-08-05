package com.hr_mogador.services;

import com.hr_mogador.entities.Employe;
import com.hr_mogador.repositories.EmployeRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeService {
    private final EmployeRepository employeRepository;

    public EmployeService(EmployeRepository employeRepository) {
        this.employeRepository = employeRepository;
    }

    public List<Employe> getAllEmployes() {
        return employeRepository.findAll();
    }

    public Optional<Employe> getEmployeById(Long id) {
        return employeRepository.findById(id);
    }

    public Employe createEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    public Employe updateEmploye(Long id, Employe employeDetails) {
        Employe employe = employeRepository.findById(id).orElse(null);
        if (employe != null) {
            employe.setPrenomEmploye(employeDetails.getPrenomEmploye());
            employe.setNomEmploye(employeDetails.getNomEmploye());
            employe.setEmailEmploye(employeDetails.getEmailEmploye());
            employe.setPoste(employeDetails.getPoste());
            employe.setDataDembauche(employeDetails.getDataDembauche());
            employe.setRh(employeDetails.getRh());
            employe.setConges(employeDetails.getConges());
            employe.setDepartement(employeDetails.getDepartement());
            return employeRepository.save(employe);
        }
        return null;
    }

    public void deleteEmploye(Long id) {
        employeRepository.deleteById(id);
    }
}

