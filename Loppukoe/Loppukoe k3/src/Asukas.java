class Asukas {

    // Luokka Asukas, jolla on seuraavat ominaisuudet:
    private String etunimi;
    private String sukunimi;
    private String asunnonNumero;
    private int ika;

    // Konstruktori, joka saa parametreina etunimen, sukunimen, asunnon numeron ja iän.
    public Asukas(String etunimi, String sukunimi, String asunnonNumero, int ika) {
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.asunnonNumero = asunnonNumero;
        this.ika = ika;
    }

    // Metodi toString, joka palauttaa merkkijonon, jossa on asukkaan etu- ja sukunimi, asunnon numeron ja iän.
    @Override
    public String toString() {
        return etunimi + " " + sukunimi + ", Asunto: " + asunnonNumero + ", Ikä: " + ika;
    }

    // Getterit
    public String getAsunnonNumero() {
        return asunnonNumero;
    }

    public int getIka() {
        return ika;
    }
}


