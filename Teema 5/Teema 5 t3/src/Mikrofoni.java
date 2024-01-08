public class Mikrofoni implements ITelephoneMic {
    private int volume;

    @Override
    public boolean micOn() {
        // Toteuta logiikka
        return true; // Oletetaan, että toiminto onnistuu aina
    }

    @Override
    public boolean micOff() {
        // Toteuta logiikka
        return true; // Oletetaan, että toiminto onnistuu
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public int getVolume() {
        return volume;
    }
}