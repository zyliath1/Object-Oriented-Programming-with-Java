import java.util.ArrayList;
import java.util.List;

class TakuuUtils {
    public static List<Takuukorjaus> palautaTuotteenTakuuasiat(List<Takuukorjaus> kaikkiTakuukorjaukset, String tuotekoodi) {
        List<Takuukorjaus> tuotteenTakuukorjaukset = new ArrayList<>();
        for (Takuukorjaus korjaus : kaikkiTakuukorjaukset) {
            if (korjaus.getTuotekoodi().equals(tuotekoodi)) {
                tuotteenTakuukorjaukset.add(korjaus);
            }
        }
        return tuotteenTakuukorjaukset;
    }
}
