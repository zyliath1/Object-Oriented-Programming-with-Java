import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        IJasenTiedot turmiolanEra = new TurmiolanEra();
        IJasenTiedot haminalahdenMetsastysseura = new HaminalahdenMetsastysseura();

        ArrayList<Jasen> turmiolanEranJasenet = turmiolanEra.getJasenTiedot();
        ArrayList<Jasen> haminalahdenJasenet = haminalahdenMetsastysseura.getJasenTiedot();

        for (Jasen jasen : turmiolanEranJasenet) {
            jasen.tulostaJasenTiedot();
        }

        for (Jasen jasen : haminalahdenJasenet) {
            jasen.tulostaJasenTiedot();
        }
    }
}
