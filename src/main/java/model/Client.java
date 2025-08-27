package model;

public class Client {
    private int id;
    private String nom;
    private String prenom;
    private int numeroRue;
    private String rue;
    private String ville;


    public Client(){
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

    public void setPrenom(String jean) {
        this.prenom = prenom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setNumeroRue(int numeroRue) {
        this.numeroRue = numeroRue;
    }

    public int getNumeroRue() {
        return numeroRue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getRue() {
        return rue;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getVille() {
        return ville;
    }

}
