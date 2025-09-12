package model;

public class Lieu {
    private int id;
    private String ville;
    private int nbDeBoxes;
    private String commentaires;

    public Lieu(){
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getVille() {
        return ville;
    }

    public void setNbDeBoxes(int nbDeBoxes) {
        this.nbDeBoxes = nbDeBoxes;
    }

    public int getNbDeBoxes() {
        return nbDeBoxes;
    }

    public void setCommentaires(String commentaires) {
        this.commentaires = commentaires;
    }

    public String getCommentaires() {
        return commentaires;
    }
}
