import java.util.ArrayList;
import java.util.List;

class Opiskelija {
    private String nimi;
    private List<Suoritus> suoritukset;

    public Opiskelija(String nimi) {
        this.nimi = nimi;
        this.suoritukset = new ArrayList<>();
    }

    public void lisaaSuoritus(Suoritus suoritus) {
        suoritukset.add(suoritus);
    }

    public String getNimi() {
        return nimi;
    }

    public List<Suoritus> getSuoritukset() {
        return suoritukset;
    }
}
