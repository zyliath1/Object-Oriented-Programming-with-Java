public class Tuote {
    // Attribuutit tuotteen perustietoja varten
    private String tuotenumero;
    private int tuotepaikka;
    private int maara;

    // Oletuskonstruktori
    public Tuote() {
    }

    // Konstruktori, joka asettaa vain tuotenumeron
    public Tuote(final String tuotenumero) {
        this.tuotenumero = tuotenumero;
    }

    // Konstruktori, joka asettaa tuotenumeron, määrän ja tuotepaikan
    public Tuote(final String tuotenumero, final int maara, final int tuotepaikka) {
        this.tuotenumero = tuotenumero;
        this.maara = maara;
        this.tuotepaikka = tuotepaikka;
    }

    // Getteri tuotenumerolle
    public String getTuotenumero() {
        return tuotenumero;
    }

    // Setteri tuotenumerolle
    public void setTuotenumero(String tuotenumero) {
        this.tuotenumero = tuotenumero;
    }

    // Getteri tuotepaikalle
    public int getTuotepaikka() {
        return tuotepaikka;
    }

    // Setteri tuotepaikalle
    public void setTuotepaikka(int tuotepaikka) {
        this.tuotepaikka = tuotepaikka;
    }

    // Getteri määrälle
    public int getMaara() {
        return maara;
    }

    // Setteri määrälle
    public void setMaara(int maara) {
        this.maara = maara;
    }
}


