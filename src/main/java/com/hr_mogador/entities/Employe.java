package com.hr_mogador.entities;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEmploye;
    private String prenomEmploye;
    private String nomEmploye;
    private String emailEmploye;
    private String poste;
    private String departement;
    private LocalDate dataDembauche;

    @ManyToOne
    @JoinColumn(name = "idRH")
    private Rh rh;

    @OneToMany(mappedBy = "employe")
    private List<Conges> conges;

    @OneToMany(mappedBy = "employe")
    private List<Paies> paies;

    @OneToOne(mappedBy = "employe")
    private Utilisateur utilisateur;

    public Long getIdEmploye() {
        return idEmploye;
    }

    public String getPrenomEmploye() {
        return prenomEmploye;
    }

    public void setPrenomEmploye(String prenomEmploye) {
        this.prenomEmploye = prenomEmploye;
    }

    public String getNomEmploye() {
        return nomEmploye;
    }

    public void setNomEmploye(String nomEmploye) {
        this.nomEmploye = nomEmploye;
    }

    public String getEmailEmploye() {
        return emailEmploye;
    }

    public void setEmailEmploye(String emailEmploye) {
        this.emailEmploye = emailEmploye;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public LocalDate getDataDembauche() {
        return dataDembauche;
    }

    public void setDataDembauche(LocalDate dataDembauche) {
        this.dataDembauche = dataDembauche;
    }

    public Rh getRh() {
        return rh;
    }

    public void setRh(Rh rh) {
        this.rh = rh;
    }

    public List<Conges> getConges() {
        return conges;
    }

    public void setConges(List<Conges> conges) {
        this.conges = conges;
    }

    public List<Paies> getPaies() {
        return paies;
    }

    public void setPaies(List<Paies> paies) {
        this.paies = paies;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
}
