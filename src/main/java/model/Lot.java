package model;

public class Lot {
    private int id;
    private int prixDepart;

    public Lot() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public static Lot getInstance() {
        return ;
    }

    public void setPrixDepart(int prixDepart) {
        this.prixDepart = prixDepart;
    }

    public int getPrixDepart() {
        return prixDepart;
    }
}
