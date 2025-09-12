package test;

import model.Encheres;
import model.Lot;
import model.Client;

public class TestEncheres {
    public static void main(String[] args) {
        Encheres e1 = new Encheres();
        e1.setNumero(3);
        e1.setMontant(5000);

        Lot lot3 = new Lot();
        lot3.setId(1);
        lot3.setPrixDepart(2000);

        Client client1 = new Client();
        client1.setId(1);
        client1.setNom("John");
        client1.setPrenom("Jean");
        client1.setNumeroRue(3);
        client1.setRue("lilas");
        client1.setVille("caen");

        e1.setLot(lot3);
        e1.setClient(client1);

        System.out.println(e1.getClient().getNom()+" "+e1.getClient().getPrenom()+" "+e1.getClient().getNumeroRue()+" "+e1.getLot().getPrixDepart());
        System.out.println(e1.getLot().getPrixDepart());



    }
}
