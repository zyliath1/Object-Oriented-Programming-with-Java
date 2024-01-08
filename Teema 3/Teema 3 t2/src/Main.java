import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> luvut = Arrays.asList(10.5, 20.3, 30.7, 40.2, 50.5);

        double summa = MathUtils.laskeYhteen(luvut);
        System.out.println("Lukujen summa: " + summa);

        double suurin = MathUtils.suurinLuku(luvut);
        System.out.println("Suurin luku: " + suurin);

        double keskiarvo = MathUtils.laskeKeskiarvo(luvut);
        System.out.println("Lukujen keskiarvo: " + keskiarvo);
    }
}
