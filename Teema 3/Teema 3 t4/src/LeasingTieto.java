import java.time.LocalDate;

public class LeasingTieto {
    private Tietokone tietokone;
    private Kayttaja kayttaja;
    private LocalDate paivamaara;

    public LeasingTieto(Tietokone tietokone, Kayttaja kayttaja, LocalDate paivamaara) {
        this.tietokone = tietokone;
        this.kayttaja = kayttaja;
        this.paivamaara = paivamaara;
    }

    // Getterit ja setterit
    public Tietokone getTietokone() { return tietokone; }
    public Kayttaja getKayttaja() { return kayttaja; }
    public LocalDate getPaivamaara() { return paivamaara; }

    @Override
    public String toString() {
        return "Tietokone: " + tietokone + "\nKayttaja: " + kayttaja + "\nPaivamaara: " + paivamaara;
    }
}
