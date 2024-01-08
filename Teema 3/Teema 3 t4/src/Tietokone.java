public class Tietokone {
    private String merkki;
    private String malli;
    private String sarjanumero;

    public Tietokone(String merkki, String malli, String sarjanumero) {
        this.merkki = merkki;
        this.malli = malli;
        this.sarjanumero = sarjanumero;
    }

    // Getterit ja setterit
    public String getMerkki() { return merkki; }
    public String getMalli() { return malli; }
    public String getSarjanumero() { return sarjanumero; }
    public void setSarjanumero(String sarjanumero) { this.sarjanumero = sarjanumero; }

    @Override
    public String toString() {
        return "Merkki: " + merkki + ", Malli: " + malli + ", Sarjanumero: " + sarjanumero;
    }
}
