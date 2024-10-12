package hu.soter.modell;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmberTest {
    private Ember ember;

    @Test
    void testUresKstrNev() {
        ember = new Ember();
        String nev = ember.getNev();
        String hiba = "üres konstruktor hibás: nem tartalmaz nevet";
        Assertions.assertFalse(nev == null, hiba);
    }

    @Test
    void testBemutatkozoSzovegUres() {
        ember = new Ember("Balázs", 28);
        String hiba = "a bemutatkozás nem tartalmaz szöveget";
        Assertions.assertFalse(ember.bemutatkozoSzoveg() == null, hiba);
    }

    @Test
    void testNagyKezdobetusNev() {
        ember = new Ember("Balázs", 28);
        boolean hibas;
        if (Character.isUpperCase(ember.getNev().charAt(0))) {
            hibas = false;
        } else {
            hibas = true;
        }
        String hiba = "a név nem nagybetűvel kezdődik";
        Assertions.assertFalse(hibas, hiba);
    }
}