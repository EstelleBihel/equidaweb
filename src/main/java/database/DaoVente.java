package database;

import model.Vente;
import model.Lieu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DaoVente {
    //Méthode getLesVentes = retourne une liste d’objets Vente à partir de la base de données.
    public static ArrayList<Vente> getLesVentes(Connection cnx) {
        ArrayList<Vente> lesVentes = new ArrayList<>();
        //Req SQL avec jointure pour récupérer les ventes et leurs lieux associés
        String sql = "SELECT v.id as v_id, v.nom as v_nom, v.date as v_date, " +
                "l.id as l_id, l.ville as l_ville, l.nb_de_boxes as l_nb_de_boxes, l.commentaires as l_commentaires " +
                "FROM vente v " +
                "INNER JOIN lieu l ON v.lieu_id = l.id";
        try (PreparedStatement requeteSql = cnx.prepareStatement(sql);
             ResultSet resultatRequete = requeteSql.executeQuery()) {
            // Parcours des résultats de la requête : pour chaque ligne, création d'un objet Vente et d'un objet Lieu, puis association
            while (resultatRequete.next()) {
                Vente vente = new Vente();
                vente.setId(resultatRequete.getInt("v_id"));
                vente.setNom(resultatRequete.getString("v_nom"));
                vente.setDateDeVente(resultatRequete.getString("v_date"));

                Lieu lieu = new Lieu();
                lieu.setId(resultatRequete.getInt("l_id"));
                lieu.setVille(resultatRequete.getString("l_ville"));
                lieu.setNbDeBoxes(resultatRequete.getInt("l_nb_de_boxes"));
                lieu.setCommentaires(resultatRequete.getString("l_commentaires"));

                vente.setLieu(lieu);
                lesVentes.add(vente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("La requête de getLesVentes a généré une exception SQL");
        }
        //retourne la liste des ventes avec leurs lieux associés
        return lesVentes;
    }
}
