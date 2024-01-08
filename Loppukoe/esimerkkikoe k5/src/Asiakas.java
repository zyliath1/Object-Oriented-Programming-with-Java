class Asiakas extends Henkilo {
    private String asiakasnumero;
    private String asiakkuudenAloituspaiva;

    public Asiakas(String nimi, String syntymaaika, String osoite, String asiakasnumero, String asiakkuudenAloituspaiva) {
        super(nimi, syntymaaika, osoite);
        this.asiakasnumero = asiakasnumero;
        this.asiakkuudenAloituspaiva = asiakkuudenAloituspaiva;
    }

    @Override
    public void tulostaTiedot() {
        System.out.println("Asiakasnumero: " + asiakasnumero + ", Nimi: " + nimi + ", Syntymäaika: " + syntymaaika +
                ", Osoite: " + osoite + ", Asiakkuuden aloituspaiva: " + asiakkuudenAloituspaiva);
    }
}