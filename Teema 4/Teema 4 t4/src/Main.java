import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Luodaan lista Tietokone-olioita varten
        List<Tietokone> tietokoneet = new ArrayList<>();

        // Lisätään Tietokone-olioita listaan. Jokaiselle oliolle annetaan merkki, malli,
        // tuotenumero, määrä ja tuotepaikka konstruktorin kautta.
        tietokoneet.add(new Tietokone("Asus", "ER443", "212232", 3, 12));
        tietokoneet.add(new Tietokone("Lenovo", "HH544", "3233", 21, 15));
        tietokoneet.add(new Tietokone("Fujitsu", "3323F", "9888", 5, 2));
        tietokoneet.add(new Tietokone("IBM", "IBM3444", "343", 2, 150));

        // Käydään läpi lista ja tulostetaan kunkin tietokoneen tiedot.
        for (Tietokone tietokone : tietokoneet) {
            tulostaTietokoneenTiedot(tietokone);
        }
    }

    // Apumetodi tietokoneen tietojen tulostamiseen.
    // Tulostaa tietokoneen merkin, mallin, tuotenumeron, määrän ja tuotepaikan.
    private static void tulostaTietokoneenTiedot(Tietokone tietokone) {
        System.out.println("Merkki: " + tietokone.getMerkki());
        System.out.println("Malli: " + tietokone.getMalli());
        System.out.println("Tuotenumero: " + tietokone.getTuotenumero());
        System.out.println("Määrä: " + tietokone.getMaara());
        System.out.println("Tuotepaikka: " + tietokone.getTuotepaikka());
        System.out.println();
    }
}

