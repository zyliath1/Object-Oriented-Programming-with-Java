import java.util.ArrayList;
import java.util.List;

public class Opiskelijat {
    private List<Opiskelija> opiskelijalista;

    public Opiskelijat() {
        this.opiskelijalista = new ArrayList<>();
    }

    public void lisaaOpiskelija(Opiskelija o) {
        opiskelijalista.add(o);
    }

    public void poistaOpiskelija(Opiskelija o) {
        opiskelijalista.remove(o);
    }

    public void tulostaAsukkaat(String kaupunki) {
        for (Opiskelija o : opiskelijalista) {
            if (o.getOsoite().getKaupunki().equalsIgnoreCase(kaupunki)) {
                System.out.println(o);
            }
        }
    }
}
