package model;

public class Vente {
    private int id;
    private String nom;
    private String dateDeVente;

    private CategorieVente categorieVente;
    private Lieu lieu;

    public void setLieu(Lieu lieu) {
        this.lieu = lieu;
    }

    public Lieu getLieu() {
        return lieu;
    }

    public CategorieVente getCategorieVente() {
        return categorieVente;
    }

    public void setCategorieVente(CategorieVente categorieVente) {
        this.categorieVente = categorieVente;
    }

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
