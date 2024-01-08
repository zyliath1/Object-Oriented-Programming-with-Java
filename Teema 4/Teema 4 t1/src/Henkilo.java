public class Henkilo {
    // Attribuutit henkilön perustietoja varten
    private String nimi;
    private String osoite;
    private String syntymaaika;

    // Konstruktori, joka asettaa nimen, osoitteen ja syntymäajan
    public Henkilo(String nimi, String osoite, String syntymaaika) {
        this.nimi = nimi;
        this.osoite = osoite;
        this.syntymaaika = syntymaaika;
    }

    // Getteri nimen hakemiseen
    protected String getHenkilonTiedot() {
        return nimi + ", " + osoite + ", " + syntymaaika;
    }
}
