import java.util.ArrayList;

class AsiakasIntegratorImpl implements AsiakasIntegrator {
    @Override
    public ArrayList<Asiakas> haeAsiakkaat() {
        ArrayList<Asiakas> asiakkaat = new ArrayList<>();
        asiakkaat.add(new Asiakas("Matti Meikäläinen", "01-01-1980", "Esimerkkikatu 1", "12345", "01-01-2020"));
        asiakkaat.add(new Asiakas("Maija Mallikas", "02-02-1990", "Mallikatu 2", "23456", "02-02-2021"));
        return asiakkaat;
    }
}
