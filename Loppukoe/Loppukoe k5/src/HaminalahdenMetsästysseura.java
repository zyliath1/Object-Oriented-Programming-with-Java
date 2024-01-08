import java.util.ArrayList;

class HaminalahdenMetsastysseura implements IJasenTiedot {
    @Override
    public ArrayList<Jasen> getJasenTiedot() {
        ArrayList<Jasen> jasenet = new ArrayList<>();
        jasenet.add(new Jasen("Riku", "Kosonen", "miku@gmail.com", "HaminalahdenMetsastysseura", 67890));
        jasenet.add(new Jasen("Matti", "Sinkkilä", "matti@gmail.com", "HaminalahdenMetsastysseura", 12345));
        jasenet.add(new Jasen("Mikko", "Mäkinen", "mikko@gmail.com", "HaminalahdenMetsastysseura", 54321));
        return jasenet;
    }
}
