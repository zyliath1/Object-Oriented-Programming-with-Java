public class Main {
    public static void main(String[] args) {
        // Luodaan kaksi Tietokone-oliota käyttäen ylikuormitettua konstruktoria
        Opiskelija opiskelija = new Opiskelija("Matti Meikäläinen", "Esimerkkikatu 123", "01.01.2000", 12345, "01.09.2018");
        Henkilokunta henkilokunta = new Henkilokunta("Liisa Esimerkki", "Mallitie 456", "02.02.1980", "001", "Toimisto", "Johtaja");

        opiskelija.tulostaOpiskelija();
        henkilokunta.tulostaHenkilokunta();
    }
}
