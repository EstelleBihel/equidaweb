package test;

import java.sql.Connection;
import java.util.ArrayList;

import database.Connexionbdd;
import database.DaoCheval;
import database.DaoVente;
import model.Cheval;
import model.Race;
import model.Vente;

public class TestConnexionBdd {

    public static void main (String args[]) {

        Connection cnx = Connexionbdd.ouvrirConnexion();
        int idCheval = 3;
        Cheval ch = DaoCheval.getLeCheval(cnx, idCheval);
        if (ch != null) {
            System.out.println(ch.getId());
        } else {
            System.out.println("Aucun cheval trouvé !");
        }

        System.out.println ("nombre de chevaux = " + DaoCheval.getLesChevaux(cnx).size());

        for (Cheval c : DaoCheval.getLesChevaux(cnx)) {
            System.out.println("cheval : "+" "+c.getId()+" "+c.getNom()+" "+c.getRace().getNom()+" "+c.getSire()+" "+c.getDateNaissance()+" "+c.getSexe()+" "+c.getRobe());
        }

        // Réutilisation de la variable ch
        ch = DaoCheval.getLeCheval(cnx, 3);
        if (ch != null) {
            System.out.println("cheval : "+" "+ch.getId()+" "+ch.getNom()+" "+ch.getRace().getNom()+" "+ch.getSire()+" "+ch.getDateNaissance()+" "+ch.getSexe()+" "+ch.getPoids()+" "+ch.getTaille()+" "+ch.getRobe());
        } else {
            System.out.println("Aucun cheval trouvé !");
        }
        ArrayList<Vente> ventes = DaoVente.getLesVentes(cnx);
        for (Vente v : ventes) {
            System.out.println("vente : "+" "+v.getId()+" "+v.getNom()+" "+v.getDateDeVente()+" "+v.getLieu().getVille());
        }
    }
}
