public class Takki {

    // Attribuutit
    String vari;
    String koko;

    public Takki(String vari, String koko) {
        this.vari = vari;
        this.koko = koko;
    }

    // getterit ja setterit
    public String getVari() {
        return vari;
    }

    public void setVari(String vari) {
        this.vari = vari;
    }

    public String getKoko() {
        return koko;
    }

    public void setKoko(String koko) {
        this.koko = koko;
    }

    // toString metodi palauttaa olion tiedot merkkijonona
    @Override
    public String toString() {
        return "\tVäri: " + vari + "\n" + "\tKoko: " + koko;
    }
}
