import  java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Takuukorjaus {
    private String tuotekoodi;
    private String ongelmanKuvaus;
    private String ratkaisu;
    private double kustannukset;

    public Takuukorjaus(String tuotekoodi, String ongelmanKuvaus, String ratkaisu, double kustannukset) {
        this.tuotekoodi = tuotekoodi;
        this.ongelmanKuvaus = ongelmanKuvaus;
        this.ratkaisu = ratkaisu;
        this.kustannukset = kustannukset;
    }

    public String getTuotekoodi() {
        return tuotekoodi;
    }

    public String getOngelmanKuvaus() {
        return ongelmanKuvaus;
    }

    public String getRatkaisu() {
        return ratkaisu;
    }

    public double getKustannukset() {
        return kustannukset;
    }

    public void setTuotekoodi(String tuotekoodi) {
        this.tuotekoodi = tuotekoodi;
    }

    public void setOngelmanKuvaus(String ongelmanKuvaus) {
        this.ongelmanKuvaus = ongelmanKuvaus;
    }

    public void setRatkaisu(String ratkaisu) {
        this.ratkaisu = ratkaisu;
    }

    public void setKustannukset(double kustannukset) {
        this.kustannukset = kustannukset;
    }

    @Override
    public String toString() {
        return "Tuotekoodi: " + tuotekoodi + ", Ongelma: " + ongelmanKuvaus +
                ", Ratkaisu: " + ratkaisu + ", Kustannukset: " + kustannukset + "€";
    }
}
