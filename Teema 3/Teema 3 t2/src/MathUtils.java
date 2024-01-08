import java.util.List;

public class MathUtils {

    // Metodi, joka laskee yhteen listan desimaalilukuja
    public static double laskeYhteen(List<Double> luvut) {
        double summa = 0;
        for (double luku : luvut) {
            summa += luku;
        }
        return summa;
    }

    // Metodi, joka palauttaa suurimman luvun listasta
    public static double suurinLuku(List<Double> luvut) {
        double suurin = luvut.get(0);
        for (double luku : luvut) {
            if (luku > suurin) {
                suurin = luku;
            }
        }
        return suurin;
    }

    // Metodi, joka laskee ja palauttaa keskiarvon listan luvuista
    public static double laskeKeskiarvo(List<Double> luvut) {
        double summa = laskeYhteen(luvut);
        return summa / luvut.size();
    }
}