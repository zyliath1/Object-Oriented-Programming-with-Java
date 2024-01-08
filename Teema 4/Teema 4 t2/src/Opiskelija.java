public class Opiskelija extends Henkilo {
    // Attribuutit opiskelijan tietoja varten
    private int opiskelijanumero;
    private String aloituspaiva;

    // Konstruktori, joka asettaa nimen, osoitteen, syntymäajan, opiskelijanumeron ja aloitusajan
    public Opiskelija(String nimi, String osoite, String syntymaaika, int opiskelijanumero, String aloituspaiva) {
        super(nimi, osoite, syntymaaika);
        this.opiskelijanumero = opiskelijanumero;
        this.aloituspaiva = aloituspaiva;
    }

    // Getteri opiskelijanumerolle
    public void tulostaOpiskelija() {
        System.out.println(getHenkilonTiedot() + ", " + opiskelijanumero + ", " + aloituspaiva);
    }
}
