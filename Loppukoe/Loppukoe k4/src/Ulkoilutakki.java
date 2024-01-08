public class Ulkoilutakki extends Takki{

    // Attribuutit
    int vedenpitavyys;
    int hengittavyys;

    // konstruktori
    public Ulkoilutakki(String vari, String koko, int vedenpitavyys, int hengittavyys) {
        super(vari, koko);
        setVedenpitavyys(vedenpitavyys);
        setHengittavyys(hengittavyys);
    }

    // getterit ja setterit
    public int getVedenpitavyys() {
        return vedenpitavyys;
    }

    public void setVedenpitavyys(int vedenpitavyys) {
        if (vedenpitavyys == 1000 || vedenpitavyys == 3000 || vedenpitavyys == 5000 || vedenpitavyys == 10000) {
            this.vedenpitavyys = vedenpitavyys;
        } else {
            this.vedenpitavyys = 1000;
        }
    }

    public int getHengittavyys() {
        return hengittavyys;
    }

    public void setHengittavyys(int hengittavyys) {
        if (hengittavyys >= 0 && hengittavyys <= 5000) {
            this.hengittavyys = hengittavyys;
        } else {
            this.hengittavyys = 0;
        }
    }

    // toString metodi palauttaa olion tiedot merkkijonona
    @Override
    public String toString() {
        return "Ulkoilutakki:\n" + super.toString() + "\n" + "\tVedenpitävyys: " + vedenpitavyys + "\n" + "\tHengittävyys: " + hengittavyys;
    }
}
