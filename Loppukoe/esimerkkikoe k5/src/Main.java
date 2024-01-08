import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        AsiakasIntegrator asiakasIntegrator = new AsiakasIntegratorImpl();
        ArrayList<Asiakas> asiakkaat = asiakasIntegrator.haeAsiakkaat();

        for (Asiakas asiakas : asiakkaat) {
            asiakas.tulostaTiedot();
        }
    }
}
