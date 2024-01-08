import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class T4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // Arvotaan lottorivi
        Set<Integer> todellinenLottorivi = arvoLottorivi(random);
        System.out.println("Lottorivi on: " + todellinenLottorivi);

        while (true) {
            System.out.print("Haluatko arpoa rivin (k= kyllä, e = ei)? ");
            String vastaus = input.nextLine();

            if (!vastaus.equalsIgnoreCase("k")) {
                break;
            }

            Set<Integer> arvottuRivi = arvoLottorivi(random);
            Set<Integer> oikeatNumerot = new HashSet<>(arvottuRivi);
            oikeatNumerot.retainAll(todellinenLottorivi);

            System.out.println("Ohjelma arpoi rivin: " + arvottuRivi);
            System.out.println("Oikein oli " + oikeatNumerot.size() + " kpl, jotka olivat " + oikeatNumerot);
        }

        System.out.println("Kiitos ja hei hei!");
    }

    private static Set<Integer> arvoLottorivi(Random random) {
        Set<Integer> rivi = new HashSet<>();
        while (rivi.size() < 7) {
            int numero = 1 + random.nextInt(40); // Numerot 1-40
            rivi.add(numero);
        }
        return rivi;
    }
}
