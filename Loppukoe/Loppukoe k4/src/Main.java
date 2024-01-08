import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Tässä luodaan takki-olioita ja lisätään ne takit-listaan
        ArrayList < Takki > takit = new ArrayList < Takki > ();

        takit.add(new Ulkoilutakki("musta", "M", 1000, 1000));
        takit.add(new Ulkoilutakki("sininen", "L", 3000, 3000));
        takit.add(new Ulkoilutakki("punainen", "S", 5000, 5000));
        takit.add(new Ulkoilutakki("vihreä", "XL", 10000, 10000));
        takit.add(new Ulkoilutakki("keltainen", "XXL", 15000, 6000));

        takit.add(new Juhlatakki("punainen", "S", "satiini", "ruudullinen"));
        takit.add(new Juhlatakki("vihreä", "XL", "sametti", "yksivärinen"));

        // Tässä tulostetaan takit-listan sisältö
        for (Takki takki: takit) {
            System.out.println(takki);
            System.out.println();
            }
        }
    }