public class Opiskelija {
    private String etunimi;
    private String sukunimi;
    private String opiskelijanumero;
    private Osoite osoite;

    // Konstruktorit ja muut metodit pysyvät samoina, mutta lisätään Osoite-parametri

    public Opiskelija(String etunimi, String sukunimi, String opiskelijanumero, Osoite osoite) {
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.opiskelijanumero = opiskelijanumero;
        this.osoite = osoite;
    }

    // Getterit ja setterit, mukaan lukien osoitteen getterit ja setterit

    public Osoite getOsoite() {
        return osoite;
    }

    public void setOsoite(Osoite osoite) {
        this.osoite = osoite;
    }

    @Override
    public String toString() {
        return etunimi + " " + sukunimi + ", " + opiskelijanumero + ", " + osoite.toString();
    }
}