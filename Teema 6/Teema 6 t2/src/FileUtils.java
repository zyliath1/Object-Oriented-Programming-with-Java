import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileUtils {

    // Staattinen metodi tiedoston kirjoittamiseen
    public static void WriteToFile(String fileName, String content) {
        // Luodaan uusi säie tiedoston kirjoittamista varten
        new Thread(() -> {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                writer.write(content); // Kirjoitetaan sisältö tiedostoon
            } catch (IOException e) {
                e.printStackTrace(); // Tulostetaan virhe, jos sellainen ilmenee
            }
        }).start(); // Käynnistetään säie
    }

    // Staattinen metodi tiedoston lukemiseen
    public static String ReadFromFile(String fileName) throws IOException {
        // Luetaan tiedoston sisältö ja palautetaan se merkkijonona
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }
}
