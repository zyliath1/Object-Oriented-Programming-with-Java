// Luokka Osake, joka sisältää osakkeen tiedot ja laskentametodit
public class Osake {
    private String nimi;
    private double ostohinta;

    // Konstruktori, joka alustaa osakkeen tiedot
    public Osake(String nimi, double ostohinta) {
        this.nimi = nimi;
        this.ostohinta = ostohinta;
    }

    // Julkinen metodi, joka tulostaa ja palauttaa osakkeen arvon annetun ajanjakson jälkeen
    public double tulostaArvo(double kasvuprosentti, int vuodet) {
        double arvo = ostohinta;
        for (int i = 0; i < vuodet; i++) {
            arvo = laskeTuottoYhdelleVuodelle(arvo, kasvuprosentti);
        }
        System.out.println("Osakkeen " + nimi + " arvo " + vuodet + " vuoden jälkeen: " + arvo);
        return arvo;
    }

    // Yksityinen metodi, joka laskee ja palauttaa osakkeen arvon yhden vuoden jälkeen
    private double laskeTuottoYhdelleVuodelle(double paaoma, double kasvuprosentti) {
        return paaoma * (1 + kasvuprosentti);
    }
}
