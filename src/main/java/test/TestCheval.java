package test;

import com.sun.jna.platform.linux.LibC;
import model.Race;
import model.Cheval;

public class TestCheval {
    public static void main(String[] args) {
        Cheval c = new Cheval();
        c.setId(2);
        c.setNom("Houri");

        Race r = new Race();
        r.setId(1);
        r.setNom("pur sang");

        c.setRace(r);

        System.out.println("cheval : "+ c.getId()+" "+c.getRace().getId()+c.getRace().getNom());

    }
}
