public class Jasen extends JasenBase {
    private String etunimi;
    private String sukunimi;
    private String email;

    public Jasen(String etunimi, String sukunimi, String email, String jasenseura, int vakuutusnro) {
        super(jasenseura, vakuutusnro);
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.email = email;
    }

    @Override
    public void tulostaJasenTiedot() {
        System.out.println("Nimi: " + etunimi + " " + sukunimi + ", Email: " + email +
                ", Seura: " + jasenseura + ", Vakuutusnumero: " + vakuutusnro);
    }
}



