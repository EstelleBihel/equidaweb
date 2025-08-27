package test;

import model.Lot;
import model.Vente;
import model.Cheval;

public class TestLot {
    public static void main(String[] args) {
        Lot lot1 = new Lot();
        lot1.setId(8);
        lot1.setPrixDepart(5000);

        Vente v1= new Vente();
        v1.setNom("Vente 1");
        v1.setId(1);
        v1.setDateDeVente("23/06/2024");

        Cheval ch1 = new Cheval();
        ch1.setId(5);
        ch1.setNom("Bernard");

        lot1.setVente(v1);
        lot1.setCheval(ch1);

        System.out.println(lot1.getVente().getNom()+" "+lot1.getVente().getDateDeVente()+" "+lot1.getCheval().getNom());
        System.out.println(lot1.getCheval().getNom())+lot1.getCheval().getId());
    }
}
