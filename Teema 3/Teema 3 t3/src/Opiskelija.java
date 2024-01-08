public class Opiskelija {
    private String etunimi;
    private String sukunimi;
    private String opiskelijanumero;
    private String osoite;

    // Konstruktori
    public Opiskelija(String etunimi, String sukunimi, String opiskelijanumero, String osoite) {
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.opiskelijanumero = opiskelijanumero;
        this.osoite = osoite;
    }

    // Getterit ja setterit
    public String getEtunimi() { return etunimi; }
    public void setEtunimi(String etunimi) { this.etunimi = etunimi; }

    public String getSukunimi() { return sukunimi; }
    public void setSukunimi(String sukunimi) { this.sukunimi = sukunimi; }

    public String getOpiskelijanumero() { return opiskelijanumero; }
    public void setOpiskelijanumero(String opiskelijanumero) { this.opiskelijanumero = opiskelijanumero; }

    public String getOsoite() { return osoite; }
    public void setOsoite(String osoite) { this.osoite = osoite; }
}
