public class Osoite {
    private String katuosoite;
    private String postinumero;
    private String kaupunki;

    public Osoite(String katuosoite, String postinumero, String kaupunki) {
        this.katuosoite = katuosoite;
        this.postinumero = postinumero;
        this.kaupunki = kaupunki;
    }

    // Getterit ja setterit
    public String getKatuosoite() {
        return katuosoite;
    }

    public void setKatuosoite(String katuosoite) {
        this.katuosoite = katuosoite;
    }

    public String getPostinumero() {
        return postinumero;
    }

    public void setPostinumero(String postinumero) {
        this.postinumero = postinumero;
    }

    public String getKaupunki() {
        return kaupunki;
    }

    public void setKaupunki(String kaupunki) {
        this.kaupunki = kaupunki;
    }

    @Override
    public String toString() {
        return katuosoite + ", " + postinumero + " " + kaupunki;
    }
}