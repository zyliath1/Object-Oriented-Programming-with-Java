import java.util.Scanner;

public class Auto {
    // Yksityiset attribuutit
    private String rekisterinumero;
    private String merkki;
    private int vuosimalli;
    private String malli;

    // Muodostimet
    public Auto() {
    }

    public Auto(String rekisterinumero, String merkki) {
        this.rekisterinumero = rekisterinumero;
        this.merkki = merkki;
    }

    public Auto(String rekisterinumero, String merkki, int vuosimalli, String malli) {
        this.rekisterinumero = rekisterinumero;
        this.merkki = merkki;
        setVuosimalli(vuosimalli); // Käyttää setteriä, joka sisältää tarkistuksen
        this.malli = malli;
    }

    // Get- ja Set-metodit
    public String getRekisterinumero() {
        return rekisterinumero;
    }

    public void setRekisterinumero(String rekisterinumero) {
        if (rekisterinumero != null && rekisterinumero.length() <= 7 && rekisterinumero.contains("-")) {
            this.rekisterinumero = rekisterinumero;
        }
    }

    public String getMerkki() {
        return merkki;
    }

    public void setMerkki(String merkki) {
        this.merkki = merkki;
    }

    public int getVuosimalli() {
        return vuosimalli;
    }

    public void setVuosimalli(int vuosimalli) {
        if (vuosimalli >= 1900 && vuosimalli < java.time.Year.now().getValue()) {
            this.vuosimalli = vuosimalli;
        } else {
            this.vuosimalli = 1900;
        }
    }

    public String getMalli() {
        return malli;
    }

    public void setMalli(String malli) {
        this.malli = malli;
    }

    // kysyTiedot-metodi
    public void kysyTiedot() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Anna rekisterinumero: ");
        setRekisterinumero(scanner.nextLine());

        System.out.print("Anna merkki: ");
        setMerkki(scanner.nextLine());

        System.out.print("Anna vuosimalli: ");
        setVuosimalli(scanner.nextInt());
        scanner.nextLine(); // Tyhjentää rivinvaihdon

        System.out.print("Anna malli: ");
        setMalli(scanner.nextLine());
    }

    // toString-metodi
    @Override
    public String toString() {
        return "Auto{" +
                "rekisterinumero='" + rekisterinumero + '\'' +
                ", merkki='" + merkki + '\'' +
                ", vuosimalli=" + vuosimalli +
                ", malli='" + malli + '\'' +
                '}';
    }
}

