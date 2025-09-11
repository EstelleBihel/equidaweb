package model;

public class Pays {
    private int id;
    private String nom;
    private String codePostal;

    public Pays() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getCodePostal() {
        return codePostal;
    }
}
