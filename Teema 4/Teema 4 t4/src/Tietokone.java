public class Tietokone extends Tuote {
    // Yksityiset attribuutit tietokoneen merkkiä ja mallia varten
    private String merkki;
    private String malli;

    // Oletuskonstruktori
    public Tietokone() {
    }

    // Konstruktori, joka asettaa merkin ja mallin
    public Tietokone(final String merkki, final String malli) {
        this.merkki = merkki;
        this.malli = malli;
    }

    // Konstruktori, joka asettaa merkin, mallin ja tuotenumeron
    // Tuotenumero välitetään yliluokan (Tuote) konstruktorille
    public Tietokone(final String merkki, final String malli, final String tuotenumero) {
        super(tuotenumero);
        this.merkki = merkki;
        this.malli = malli;
    }

    // Konstruktori, joka asettaa merkin, mallin, tuotenumeron, määrän ja tuotepaikan
    // Tuotenumero, määrä ja tuotepaikka välitetään yliluokan (Tuote) konstruktorille
    public Tietokone(final String merkki, final String malli, final String tuotenumero, final int maara, final int tuotepaikka) {
        super(tuotenumero, maara, tuotepaikka);
        this.merkki = merkki;
        this.malli = malli;
    }

    // Ylikirjoitettu getTuotepaikka-metodi
    @Override
    public int getTuotepaikka() {
        int alkuperainenPaikka = super.getTuotepaikka(); // Hakee alkuperäisen tuotepaikan yliluokasta

        // Päivittää tuotepaikan tehtävänannon mukaisesti
        if (alkuperainenPaikka < 10) {
            return alkuperainenPaikka + 10;
        } else if (alkuperainenPaikka <= 100) {
            return alkuperainenPaikka + 30;
        } else {
            return alkuperainenPaikka + 500;
        }
    }

    // Getteri merkille
    public String getMerkki() {
        return merkki;
    }

    // Setteri merkille
    public void setMerkki(String merkki) {
        this.merkki = merkki;
    }

    // Getteri mallille
    public String getMalli() {
        return malli;
    }

    // Setteri mallille
    public void setMalli(String malli) {
        this.malli = malli;
    }
}
