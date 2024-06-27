package com.hr_mogador.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Conges {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idConges;
    private LocalDate debutConges;
    private LocalDate finConges;
    private Integer soldeConges;
    private String status;
    private String typeConges;

    @ManyToOne
    @JoinColumn(name = "idEmploye")
    private Employe employe;

    public Long getIdConges() {
        return idConges;
    }

    public LocalDate getDebutConges() {
        return debutConges;
    }

    public LocalDate getFinConges() {
        return finConges;
    }

    public Integer getSoldeConges() {
        return soldeConges;
    }

    public String getStatus() {
        return status;
    }

    public String getTypeConges() {
        return typeConges;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setDebutConges(LocalDate debutConges) {
        this.debutConges = debutConges;
    }

    public void setFinConges(LocalDate finConges) {
        this.finConges = finConges;
    }

    public void setSoldeConges(Integer soldeConges) {
        this.soldeConges = soldeConges;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTypeConges(String typeConges) {
        this.typeConges = typeConges;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }
}
