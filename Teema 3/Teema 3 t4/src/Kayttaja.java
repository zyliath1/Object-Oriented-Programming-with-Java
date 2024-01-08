public class Kayttaja {
    private String nimi;
    private String osoite;

    public Kayttaja(String nimi, String osoite) {
        this.nimi = nimi;
        this.osoite = osoite;
    }

    // Getterit
    public String getNimi() { return nimi; }
    public String getOsoite() { return osoite; }

    // Setterit
    public void setNimi(String nimi) { this.nimi = nimi; }
    public void setOsoite(String osoite) { this.osoite = osoite; }

    @Override
    public String toString() {
        return "Nimi: " + nimi + ", Osoite: " + osoite;
    }
}

