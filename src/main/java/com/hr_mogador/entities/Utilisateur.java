package com.hr_mogador.entities;

import jakarta.persistence.*;

@Entity
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idUtilisateur;
    private String username;
    private String password;
    private String role; // 'EMPLOYE' ou 'RH'

    @OneToOne
    @JoinColumn(name = "idEmploye")
    private Employe employe;

    @OneToOne
    @JoinColumn(name = "idRh")
    private Rh rh;

    // Getters and Setters
    public Long getIdUtilisateur() {
        return idUtilisateur;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public Rh getRh() {
        return rh;
    }

    public void setRh(Rh rh) {
        this.rh = rh;
    }
}
