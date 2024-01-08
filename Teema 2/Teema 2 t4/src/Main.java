public class Main {
    public static void main(String[] args) {
        Opiskelijat opiskelijat = new Opiskelijat();

        opiskelijat.lisaaOpiskelija(new Opiskelija("Matti", "Meikäläinen", "12345", new Osoite("Katu 1", "00100", "Helsinki")));
        opiskelijat.lisaaOpiskelija(new Opiskelija("Maija", "Mallikas", "23456", new Osoite("Tie 2", "00200", "Espoo")));

        opiskelijat.tulostaAsukkaat("Helsinki"); // Tulostaa vain Helsingissä asuvat opiskelijat
        opiskelijat.tulostaAsukkaat("Espoo");   // Tulostaa vain Espoossa asuvat opiskelijat

        // Testataan poistamista
        Opiskelija poistettava = new Opiskelija("Testi", "Poistettava", "00000", new Osoite("Poistokuja 3", "00300", "Turku"));
        opiskelijat.lisaaOpiskelija(poistettava);
        opiskelijat.poistaOpiskelija(poistettava);
    }
}
