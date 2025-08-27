package test;

import com.sun.jna.platform.linux.LibC;
import model.Vente;
import model.Lieu;
import model.CategorieVente;

public class TestVente {
    public static void main(String[] args) {
        Vente v1 = new Vente();
        v1.setNom("Vente 1");
        v1.setId(1);
        v1.setDateDeVente("23/06/2024");

        CategorieVente c1 = new CategorieVente();
        c1.setCode(3);
        c1.setLibelle("Mixte");
        v1.setCategorieVente(c1);

        Lieu l1 = new Lieu();
        l1.setId(3);
        l1.setCommentaires("Prestigieux");
        l1.setNbDeBoxes(15);
        l1.setVille("Paris");
        v1.setLieu(l1);

        System.out.println("La vente : "+" "+v1.getId()+v1.getNom()+"a eu lieu à "+l1.getVille()+" "+"elle contient "+l1.getNbDeBoxes()+"/n"+l1.getCommentaires()+v1.getCategorieVente().getLibelle());
        System.out.println("La vente :"+ v1.getId()+" du "+v1.getDateDeVente()+" est de categorie "+v1.getCategorieVente().getLibelle()  );
    }
}
