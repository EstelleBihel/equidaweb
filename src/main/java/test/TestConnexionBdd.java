package test;

import java.sql.Connection;
import java.util.ArrayList;

import database.Connexionbdd;
import database.DaoCheval;
import model.Cheval;
import model.Race;

public class TestConnexionBdd {

    public static void main (String args[]) {

        Connection cnx = Connexionbdd.ouvrirConnexion();
        System.out.println ("nombre de chevaux = " + DaoCheval.getLesChevaux(cnx).size());

        for (Cheval c : DaoCheval.getLesChevaux(cnx)) {
            System.out.println("cheval : "+" "+c.getId()+" "+c.getNom()+" "+c.getRace().getNom()+" "+c.getSire()+" "+c.getDateNaissance()+" "+c.getSexe());
        }




    }

}
