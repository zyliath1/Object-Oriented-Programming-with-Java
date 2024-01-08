class Vaate extends Tuote {
    private String koko;
    private String materiaali;

    public Vaate(String nimi, double hinta, String hyllypaikka, String koodi, String koko, String materiaali) {
        super(nimi, hinta, hyllypaikka, koodi);
        this.koko = koko;
        this.materiaali = materiaali;
    }

    @Override
    public String toString() {
        return super.toString() + ", Koko: " + koko + ", Materiaali: " + materiaali;
    }
}
