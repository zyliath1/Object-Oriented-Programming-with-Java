import java.util.ArrayList;

abstract class Henkilo {
    protected String nimi;
    protected String syntymaaika;
    protected String osoite;

    public Henkilo(String nimi, String syntymaaika, String osoite) {
        this.nimi = nimi;
        this.syntymaaika = syntymaaika;
        this.osoite = osoite;
    }

    public abstract void tulostaTiedot();
}
