package hu.soter;

import hu.soter.modell.Ember;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Ember ember1 = new Ember("Balázs", 28, new ArrayList<>(Arrays.asList("Angol", "Német")));
        Ember ember2 = new Ember("Krisztina", 21, new ArrayList<>(Arrays.asList("Angol", "Spanyol")));
        Ember ember3 = new Ember("Máté", 16);

        ember1.bemutatkozik();
        ember2.bemutatkozik();
        ember3.bemutatkozik();

    }
}