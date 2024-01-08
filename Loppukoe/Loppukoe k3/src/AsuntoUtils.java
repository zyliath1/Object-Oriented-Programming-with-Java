import java.util.ArrayList;
import java.util.List;

class AsuntoUtils {

    // Metodi palautaAsujat joka saa parametrina asunnon numeron ja listan asukkaita ja palauttaa listan asukkaista, jotka asuvat annetussa asunnossa.
    public static List<Asukas> palautaAsujat(String asunnonNumero, List<Asukas> asukkaat) {
        List<Asukas> asunnonAsukkaat = new ArrayList<>();
        for (Asukas asukas : asukkaat) {
            if (asukas.getAsunnonNumero().equals(asunnonNumero)) {
                asunnonAsukkaat.add(asukas);
            }
        }
        return asunnonAsukkaat;
    }

    // Metodi keskiIka joka saa parametrina listan asukkaita ja palauttaa niiden keski-iän.
    public static double keskiIka(List<Asukas> asukkaat) {
        if (asukkaat.isEmpty()) {
            return 0;
        }
        int summa = 0;
        for (Asukas asukas : asukkaat) {
            summa += asukas.getIka();
        }
        return (double) summa / asukkaat.size();
    }
}
