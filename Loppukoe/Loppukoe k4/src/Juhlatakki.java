public class Juhlatakki extends Takki{

    // Attribuutit
    String materiaali;
    String kuvio;

    // konstruktori
    public Juhlatakki(String vari, String koko, String materiaali, String kuvio) {
        super(vari, koko);
        this.materiaali = materiaali;
        this.kuvio = kuvio;
    }

    // getterit ja setterit
    public String getMateriaali() {
        return materiaali;
    }

    public void setMateriaali(String materiaali) {
        this.materiaali = materiaali;
    }

    public String getKuvio() {
        return kuvio;
    }

    public void setKuvio(String kuvio) {
        this.kuvio = kuvio;
    }

    // toString metodi palauttaa olion tiedot merkkijonona
    @Override
    public String toString() {
        return "Juhlatakki:\n" + super.toString() + "\n" + "\tMateriaali: " + materiaali + "\n" + "\tKuvio: " + kuvio;
    }
}
