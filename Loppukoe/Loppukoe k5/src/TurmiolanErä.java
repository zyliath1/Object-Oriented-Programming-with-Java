import java.util.ArrayList;

class TurmiolanEra implements IJasenTiedot {
    @Override
    public ArrayList<Jasen> getJasenTiedot() {
        ArrayList<Jasen> jasenet = new ArrayList<>();
        jasenet.add(new Jasen("Antti", "Tuisku", "antti@outlook.com", "TurmiolanEra", 5525235));
        jasenet.add(new Jasen("Kaisa", "Vörnänen", "kaisa@outlook.com", "TurmiolanEra", 7657657));
        jasenet.add(new Jasen("Tero", "Lehtonen", "tero@outlook.com", "TurmiolanEra", 9842304));
        return jasenet;
    }
}
