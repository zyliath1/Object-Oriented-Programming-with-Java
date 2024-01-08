public class SuperSaastoTili extends Tili {
    // Konstruktori
    public SuperSaastoTili(String tilinumero, String omistaja, double saldoEuroa, double vuosikorko) {
        super(tilinumero, omistaja, saldoEuroa, vuosikorko);
    }

    // Toteuttaa abstraktin metodin laskeVuosiKorkotuotto
    @Override
    public double laskeVuosiKorkotuotto() {
        double peruskorko = getSaldoEuroa() <= 10000 ? getSaldoEuroa() * getVuosikorko() : 10000 * getVuosikorko();
        double lisakorko = getSaldoEuroa() > 10000 ? (getSaldoEuroa() - 10000) * (getVuosikorko() + 3.0) : 0;
        return (peruskorko + lisakorko) / 100;
    }

    // Toteuttaa abstraktin metodin tulostaTilinTiedot
    @Override
    public void tulostaTilinTiedot() {
        System.out.println(getOmistaja() + ": Supersaastotilin saldo on " + getSaldoEuroa() + " €, korkoprosentilla "
                + getVuosikorko() + " vuosikorko on " + laskeVuosiKorkotuotto() + " €");
    }
}
