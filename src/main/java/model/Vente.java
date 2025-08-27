package model;

public class Vente {
    private int id;
    private String nom;
    private String dateDeVente;

    public Vente() {
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

    public String getDateDeVente() {
        return dateDeVente;
    }

    public void setDateDeVente(String dateDeVente) {
        this.dateDeVente = dateDeVente;
    }
}
