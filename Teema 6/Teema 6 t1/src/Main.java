import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kysytään käyttäjältä säikeiden lukumäärä.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kuinka monta säiettä käynnistetään? ");
        int threadCount = scanner.nextInt();

        // Luodaan PrintDiamond-olio, jota säikeet käyttävät.
        PrintDiamond diamondPrinter = new PrintDiamond();

        // Käynnistetään säikeet.
        for (int i = 0; i < threadCount; i++) {
            Thread thread = new Thread(new DiamondThread(diamondPrinter));
            thread.start();
        }
    }
}
