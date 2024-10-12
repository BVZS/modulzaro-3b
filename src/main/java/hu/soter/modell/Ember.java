package hu.soter.modell;

import java.util.ArrayList;

public class Ember {
    private String nev;
    private int kor;
    private ArrayList<String> idegenNyelvek = new ArrayList<>();

    public Ember(String nev, int kor, ArrayList<String> idegenNyelvek) {
        this.nev = nev;
        this.kor = kor;
        this.idegenNyelvek = idegenNyelvek;
    }

    public String getNev() {
        return nev;
    }

    public int getKor() {
        return kor;
    }

    public ArrayList<String> getIdegenNyelvek() {
        return idegenNyelvek;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setIdegenNyelvek(ArrayList<String> idegenNyelvek) {
        this.idegenNyelvek = idegenNyelvek;
    }
}
