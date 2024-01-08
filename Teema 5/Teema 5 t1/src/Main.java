public class Main {
    public static void main(String[] args) {
        // Luodaan tiliolioita
        Saastotili saastotili = new Saastotili("FI12 3456 7890 1234 56", "Matti Meikäläinen", 1000, 1.25);
        SuperSaastoTili superSaastoTili = new SuperSaastoTili("FI12 3456 7890 1234 57", "Kalle Hakkarainen", 15000, 4.5);

        // Tulostetaan tilitiedot
        saastotili.tulostaTilinTiedot();
        superSaastoTili.tulostaTilinTiedot();
    }
}