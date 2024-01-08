public class Saastotili extends Tili {

    // Konstruktori
    public Saastotili(String tilinumero, String omistaja, double saldoEuroa, double vuosikorko) {
        super(tilinumero, omistaja, saldoEuroa, vuosikorko);
    }

    // Toteuttaa abstraktin metodin laskeVuosiKorkotuotto
    @Override
    public double laskeVuosiKorkotuotto() {
        return getSaldoEuroa() * getVuosikorko() / 100;
    }

    // Toteuttaa abstraktin metodin tulostaTilinTiedot
    @Override
    public void tulostaTilinTiedot() {
        System.out.println(getOmistaja() + ": Saastotilin saldo on " + getSaldoEuroa() + " €, korkoprosentilla "
                + getVuosikorko() + " vuosikorko on " + laskeVuosiKorkotuotto() + " €");
    }
}
