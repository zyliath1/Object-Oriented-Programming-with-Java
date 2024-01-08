public class Tuote {
    protected String nimi;
    protected double hinta;
    protected String hyllypaikka;
    protected String koodi;

    public Tuote(String nimi, double hinta, String hyllypaikka, String koodi) {
        this.nimi = nimi;
        this.hinta = hinta;
        this.hyllypaikka = hyllypaikka;
        this.koodi = koodi;
    }

     @Override
    public String toString() {
         return "Tuote: " + nimi + ", Hinta: " + hinta + ", Hyllypaikka: " + hyllypaikka + ", Koodi: " + koodi;
    }
}
