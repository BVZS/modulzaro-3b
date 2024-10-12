package hu.soter.modell;

import java.util.ArrayList;

public class Ember {
    private String nev;
    private int kor;
    private ArrayList<String> idegenNyelvek = new ArrayList<>();

    public Ember(String nev, int kor) {
        this.nev = nev;
        this.kor = kor;
        this.idegenNyelvek = new ArrayList<>();
    }

    public Ember(String nev, int kor, ArrayList<String> idegenNyelvek) {
        this.nev = nev;
        this.kor = kor;
        this.idegenNyelvek = idegenNyelvek;
    }



    private void megjelenit(String uzenet) {
        System.out.print(uzenet);
    }

    public void bemutatkozik() {
        String s = "Sziasztok! Én " + this.nev + " vagyok, " + this.kor + " éves. ";
        if (this.idegenNyelvek.isEmpty()) {
            s += "Nem beszélek idegennyelveket.";
        } else {
            s += "Ezeken a nyelveken beszélek: ";
            for (String nyelv : this.idegenNyelvek) {
                s += nyelv + ", ";
            }
            //s.substring(0, s.length() - 2);
        }
        s += "\n";
        megjelenit(s);
    }

    public void ujNyelv(String nyelv) {
        if (!this.idegenNyelvek.contains(nyelv)) {
            idegenNyelvek.add(nyelv);
            megjelenit("(" + this.nev + ") Megtanultam egy új nyelvet: " + nyelv + ".\n");
        }
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
