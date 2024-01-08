class Ruoka extends Tuote {
    private String maa;
    private String paivays;

    public Ruoka(String nimi, double hinta, String hyllypaikka, String koodi, String maa, String paivays) {
        super(nimi, hinta, hyllypaikka, koodi);
        this.maa = maa;
        this.paivays = paivays;
    }

    @Override
    public String toString() {
        return super.toString() + ", Maa: " + maa + ", Päiväys: " + paivays;
    }
}