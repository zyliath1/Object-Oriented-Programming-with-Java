public class OpiskelijaUtils {

    public static Opiskelija tarkastaTiedot(Opiskelija opiskelija) {
        if (opiskelija.getEtunimi() == null || opiskelija.getSukunimi() == null ||
                opiskelija.getOpiskelijanumero() == null || opiskelija.getOsoite() == null) {
            return null;
        }

        opiskelija.setEtunimi(muotoileNimi(opiskelija.getEtunimi()));
        opiskelija.setSukunimi(muotoileNimi(opiskelija.getSukunimi()));

        if (!opiskelija.getOpiskelijanumero().matches("[0-9]+")) {
            return null;
        }

        return opiskelija;
    }

    private static String muotoileNimi(String nimi) {
        return nimi.substring(0, 1).toUpperCase() + nimi.substring(1).toLowerCase();
    }
}
