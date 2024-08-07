package com.hr_mogador.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Rh {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idRh;
    private String prenomRH;
    private String nomRH;
    private String emailRH;
    private String country;

    @OneToMany(mappedBy = "rh")
    private List<Employe> employes;

    @OneToOne(mappedBy = "rh")
    private Utilisateur utilisateur;

    public Long getIdRH() {
        return idRh;
    }

    public String getPrenomRH() {
        return prenomRH;
    }

    public String getNomRH() {
        return nomRH;
    }

    public String getEmailRH() {
        return emailRH;
    }

    public String getCountry() {
        return country;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public List<Employe> getEmployes() {
        return employes;
    }

    public void setPrenomRH(String prenomRH) {
        this.prenomRH = prenomRH;
    }

    public void setNomRH(String nomRH) {
        this.nomRH = nomRH;
    }

    public void setEmailRH(String emailRH) {
        this.emailRH = emailRH;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setEmployes(List<Employe> employes) {
        this.employes = employes;
    }
}
