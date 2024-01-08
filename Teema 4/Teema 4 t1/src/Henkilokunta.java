public class Henkilokunta extends Henkilo {
    // Attribuutit henkilökunnan tietoja varten
    private String tyontekijanumero;
    private String toimipaikka;
    private String titteli;

    // Konstruktori, joka asettaa nimen, osoitteen, syntymäajan, työntekijänumeron, toimipaikan ja tittelin
    public Henkilokunta(String nimi, String osoite, String syntymaaika, String tyontekijanumero, String toimipaikka, String titteli) {
        super(nimi, osoite, syntymaaika);
        this.tyontekijanumero = tyontekijanumero;
        this.toimipaikka = toimipaikka;
        this.titteli = titteli;
    }

    // Metodi henkilökunnan tietojen tulostamiseen
    public void tulostaHenkilokunta() {
        System.out.println(getHenkilonTiedot() + ", " + tyontekijanumero + ", " + toimipaikka + ", " + titteli);
    }
}
