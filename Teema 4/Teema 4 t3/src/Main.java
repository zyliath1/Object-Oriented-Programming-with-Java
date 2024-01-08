public class Main {
    public static void main(String[] args) {
        // Luodaan kaksi Tietokone-oliota käyttäen ylikuormitettua konstruktoria
        Tietokone tietokone1 = new Tietokone("Lenovo", "ThinkPad", "12345", 10, 1);
        Tietokone tietokone2 = new Tietokone("Apple", "MacBook Pro", "67890", 5, 2);

        // Tulostetaan molempien tietokoneiden tiedot
        tulostaTietokoneenTiedot(tietokone1);
        tulostaTietokoneenTiedot(tietokone2);
    }

    // Apumetodi tietokoneen tietojen tulostamiseen
    private static void tulostaTietokoneenTiedot(Tietokone tietokone) {
        System.out.println("Merkki: " + tietokone.getMerkki());
        System.out.println("Malli: " + tietokone.getMalli());
        System.out.println("Tuotenumero: " + tietokone.getTuotenumero());
        System.out.println("Määrä: " + tietokone.getMaara());
        System.out.println("Tuotepaikka: " + tietokone.getTuotepaikka());
    }
}

