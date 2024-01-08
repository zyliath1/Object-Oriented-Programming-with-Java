import java.time.LocalDate;

public class LeasingUtils {

    public static LeasingTieto kopioiTiedot(LeasingTieto vanhaLeasing) {
        Tietokone uusiTietokone = new Tietokone(vanhaLeasing.getTietokone().getMerkki(),
                vanhaLeasing.getTietokone().getMalli(),
                ""); // Sarjanumero jätetään tyhjäksi
        Kayttaja uusiKayttaja = new Kayttaja("", ""); // Käyttäjän tiedot jätetään tyhjäksi
        return new LeasingTieto(uusiTietokone, uusiKayttaja, LocalDate.now()); // Päivämäärä asetetaan nykyhetkeen
    }
}
