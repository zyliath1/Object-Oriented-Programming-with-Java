import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Kysytään käyttäjältä tiedoston nimi ja syöte
        System.out.print("Anna tiedoston nimi: ");
        String fileName = scanner.nextLine();
        System.out.print("Anna syöte tiedostoon: ");
        String content = scanner.nextLine();

        // Kirjoitetaan käyttäjän syöte tiedostoon
        FileUtils.WriteToFile(fileName, content);

        // Luodaan uusi säie tiedoston sisällön lukemiseksi
        new Thread(() -> {
            try {
                Thread.sleep(1000); // Keinotekoinen viive
                // Luetaan tiedoston sisältö
                String fileContent = FileUtils.ReadFromFile(fileName);
                // Tulostetaan tiedoston sisältö
                System.out.println("Tiedoston sisältö: " + fileContent);
            } catch (InterruptedException | IOException e) {
                e.printStackTrace(); // Tulostetaan virhe, jos sellainen ilmenee
            }
        }).start(); // Käynnistetään säie
    }
}
