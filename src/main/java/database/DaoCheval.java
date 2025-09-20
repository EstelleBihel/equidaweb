package database;

import model.Cheval;
import model.Race;
import model.Robe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DaoCheval {

    /**
     * Récupère tous les chevaux présents dans la base de données avec leurs races associées
     */
    public static ArrayList<Cheval> getLesChevaux(Connection cnx) {
        ArrayList<Cheval> lesChevaux = new ArrayList<>();
        String sql = "SELECT c.id as c_id, c.nom as c_nom, c.sexe as c_sexe, c.sire as c_sire, c.date_naissance as c_dateNaissance, " +
                "r.id as r_id, r.nom as r_nom, " +
                "ro.id as ro_id, ro.nom as ro_nom, ro.description as ro_description " +
                "FROM cheval c " +
                "INNER JOIN race r ON c.race_id = r.id " +
                "INNER JOIN robe ro ON c.robe_id = ro.id";
        try (PreparedStatement requeteSql = cnx.prepareStatement(sql);
             ResultSet resultatRequete = requeteSql.executeQuery()) {
            while (resultatRequete.next()) {
                Cheval c = new Cheval();
                c.setId(resultatRequete.getInt("c_id"));
                c.setNom(resultatRequete.getString("c_nom"));
                c.setSexe(resultatRequete.getString("c_sexe"));
                c.setSire(resultatRequete.getString("c_sire"));
                java.sql.Date dateNaissanceSql = resultatRequete.getDate("c_dateNaissance");
                if (dateNaissanceSql != null) {
                    c.setDateNaissance(dateNaissanceSql.toLocalDate());
                } else {
                    c.setDateNaissance(null);
                }
                Race r = new Race();
                r.setId(resultatRequete.getInt("r_id"));
                r.setNom(resultatRequete.getString("r_nom"));
                c.setRace(r);
                Robe ro = new Robe();
                ro.setId(resultatRequete.getInt("ro_id"));
                ro.setNom(resultatRequete.getString("ro_nom"));
                ro.setDescription(resultatRequete.getString("ro_description"));
                c.setRobe(ro);
                lesChevaux.add(c);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("La requête de getLesChevaux a généré une exception SQL");
        }
        return lesChevaux;
    }

    /**
     * Récupère un cheval spécifique par son identifiant
     */
    public static Cheval getLeCheval(Connection cnx, int idCheval) {
        Cheval cheval = null;
        String sql = "SELECT c.id as c_id, c.nom as c_nom, c.sexe as c_sexe, c.sire as c_sire, c.taille as c_taille, c.poids as c_poids, " +
                "r.id as r_id, r.nom as r_nom, " +
                "ro.id as ro_id, ro.nom as ro_nom, ro.description as ro_description " +
                "FROM cheval c " +
                "INNER JOIN race r ON c.race_id = r.id " +
                "INNER JOIN robe ro ON c.robe_id = ro.id " +
                "WHERE c.id = ?";
        try (PreparedStatement requeteSql = cnx.prepareStatement(sql)) {
            requeteSql.setInt(1, idCheval);
            try (ResultSet resultatRequete = requeteSql.executeQuery()) {
                if (resultatRequete.next()) {
                    cheval = new Cheval();
                    cheval.setId(resultatRequete.getInt("c_id"));
                    cheval.setNom(resultatRequete.getString("c_nom"));
                    cheval.setSexe(resultatRequete.getString("c_sexe"));
                    cheval.setSire(resultatRequete.getString("c_sire"));
                    cheval.setTaille(resultatRequete.getDouble("c_taille"));
                    cheval.setPoids(resultatRequete.getDouble("c_poids"));

                    Race race = new Race();
                    race.setId(resultatRequete.getInt("r_id"));
                    race.setNom(resultatRequete.getString("r_nom"));
                    cheval.setRace(race);

                    Robe robe = new Robe();
                    robe.setId(resultatRequete.getInt("ro_id"));
                    robe.setNom(resultatRequete.getString("ro_nom"));
                    robe.setDescription(resultatRequete.getString("ro_description"));
                    cheval.setRobe(robe);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("La requête de getLeCheval a généré une exception SQL");
        }
        return cheval;
    }

    /**
     * Ajoute un nouveau cheval dans la base de données
     */
    public static boolean ajouterCheval(Connection cnx, Cheval cheval) {
        String sql = "INSERT INTO cheval (nom, date_naissance, race_id) VALUES (?, ?, ?)";
        try (PreparedStatement requeteSql = cnx.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            requeteSql.setString(1, cheval.getNom());
            if (cheval.getDateNaissance() != null) {
                requeteSql.setDate(2, java.sql.Date.valueOf(cheval.getDateNaissance()));
            } else {
                requeteSql.setNull(2, java.sql.Types.DATE);
            }
            requeteSql.setInt(3, cheval.getRace().getId());

            int result = requeteSql.executeUpdate();

            if (result == 1) {
                try (ResultSet rs = requeteSql.getGeneratedKeys()) {
                    if (rs.next()) {
                        cheval.setId(rs.getInt(1));
                    }
                }
                return true;
            }
            return false;

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erreur lors de l'ajout du cheval");
            return false;
        }
    }
}
