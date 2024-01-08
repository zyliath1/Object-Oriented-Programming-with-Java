import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Tuote> ostoslista = new ArrayList<>();

        while (true) {
            System.out.println("Valitse tuotetyyppi (1=Vaate, 2=Ruoka, 3=Kodinkone, 0=Lopeta):");
            int valinta = Integer.parseInt(scanner.nextLine());
            if (valinta == 0) {
                break;
            }

            System.out.print("Anna nimi: ");
            String nimi = scanner.nextLine();
            System.out.print("Anna hinta: ");
            double hinta = Double.parseDouble(scanner.nextLine());
            System.out.print("Anna hyllypaikka: ");
            String hyllypaikka = scanner.nextLine();
            System.out.print("Anna koodi: ");
            String koodi = scanner.nextLine();

            switch (valinta) {
                case 1:
                    System.out.print("Anna koko: ");
                    String koko = scanner.nextLine();
                    System.out.print("Anna materiaali: ");
                    String materiaali = scanner.nextLine();
                    ostoslista.add(new Vaate(nimi, hinta, hyllypaikka, koodi, koko, materiaali));
                    break;
                case 2:
                    System.out.print("Anna maa: ");
                    String maa = scanner.nextLine();
                    System.out.print("Anna päiväys: ");
                    String paivays = scanner.nextLine();
                    ostoslista.add(new Ruoka(nimi, hinta, hyllypaikka, koodi, maa, paivays));
                    break;
                case 3:
                    System.out.print("Anna takuu: ");
                    String takuu = scanner.nextLine();
                    System.out.print("Anna paino: ");
                    double paino = Double.parseDouble(scanner.nextLine());
                    ostoslista.add(new Kodinkone(nimi, hinta, hyllypaikka, koodi, takuu, paino));
                    break;
            }
        }

        // Tulostetaan ostoslista
        System.out.println("Ostoslista:");
        for (Tuote tuote : ostoslista) {
            System.out.println(tuote);
        }
    }
}
