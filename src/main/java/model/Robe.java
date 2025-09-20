package model;

public class Robe {
    private int id;
    private String nom;
    private String description;

    public Robe() {}

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Robe{id=" + id + ", nom='" + nom + "', description='" + description + "'}";
    }
}