import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Puhelin puhelin = new Puhelin();

        // Valitaan kaiutin
        System.out.println("Käytetään 1=Broadcom-kaiutinta 2=Qualcomm-kaiutinta?");
        int kaiutinValinta = Integer.parseInt(scanner.nextLine());
        if (kaiutinValinta == 1) {
            puhelin.setKaiutin(new BroadcomKaiutin());
        } else {
            puhelin.setKaiutin(new QualcommKaiutin());
        }

        // Valitaan mikrofoni
        System.out.println("Käytetään 1=Broadcom-mikrofonia 2=Samsung-mikrofonia?");
        int mikrofoniValinta = Integer.parseInt(scanner.nextLine());
        if (mikrofoniValinta == 1) {
            puhelin.setMikrofoni(new BroadcomMikrofoni());
        } else {
            puhelin.setMikrofoni(new SamsungMikrofoni());
        }

        while (true) {
            System.out.println("Aseta äänenvoimakkuus (0 lopettaa):");
            int volume = Integer.parseInt(scanner.nextLine());
            if (volume == 0) break;

            puhelin.getMikrofoni().setVolume(volume);
            puhelin.getKaiutin().setVolume(volume);

            // Tarkista ja tulosta mikrofonin ja kaiuttimen tila
            System.out.println("Mikrofoni päällä: " + puhelin.getMikrofoni().micOn());
            System.out.println("Kaiutin päällä: " + puhelin.getKaiutin().unMute());
        }
    }
}

