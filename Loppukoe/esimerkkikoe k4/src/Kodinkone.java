class Kodinkone extends Tuote {
    private String takuu;
    private double paino;

    public Kodinkone(String nimi, double hinta, String hyllypaikka, String koodi, String takuu, double paino) {
        super(nimi, hinta, hyllypaikka, koodi);
        this.takuu = takuu;
        this.paino = paino;
    }

    @Override
    public String toString() {
        return super.toString() + ", Takuu: " + takuu + ", Paino: " + paino;
    }
}