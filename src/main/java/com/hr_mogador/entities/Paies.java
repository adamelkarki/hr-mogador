package com.hr_mogador.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Paies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPayroll;
    private Double montantSalaire;
    private LocalDate datePaiement;
    private Double primes;
    private Double deductions;

    @ManyToOne
    @JoinColumn(name = "idEmploye")
    private Employe employe;

    public Long getIdPayroll() {
        return idPayroll;
    }

    public void setIdPayroll(Long idPayroll) {
        this.idPayroll = idPayroll;
    }

    public Double getMontantSalaire() {
        return montantSalaire;
    }

    public void setMontantSalaire(Double montantSalaire) {
        this.montantSalaire = montantSalaire;
    }

    public LocalDate getDatePaiement() {
        return datePaiement;
    }

    public void setDatePaiement(LocalDate datePaiement) {
        this.datePaiement = datePaiement;
    }

    public Double getPrimes() {
        return primes;
    }

    public void setPrimes(Double primes) {
        this.primes = primes;
    }

    public Double getDeductions() {
        return deductions;
    }

    public void setDeductions(Double deductions) {
        this.deductions = deductions;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }
}

