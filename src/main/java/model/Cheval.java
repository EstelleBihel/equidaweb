package model;

import java.time.LocalDate;

public class Cheval {

    private int id;
    private String nom;
    private LocalDate dateNaissance;
    private String sexe;
    private String sire;
    private double poids;
    private double taille;
    private Robe robe;

    private Race race;

    public Cheval() {
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }
    public double getPoids() {
        return poids;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    public double getTaille() {
        return taille;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
    public Race getRace() {
        return race;
    }
    public void setRace(Race race) {
        this.race = race;
    }
    public String getSexe() {
        return sexe;
    }
    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void setRobe(Robe robe) {
        this.robe = robe;
    }

    public Robe getRobe() {
        return robe;
    }

    public String getSire() {
        return sire;
    }
    public void setSire(String sire) {
        this.sire = sire;
    }
}
