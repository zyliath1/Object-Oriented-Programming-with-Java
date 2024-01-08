public class Kaiutin implements ITelephoneSpeaker {
    private int volume;

    @Override
    public boolean mute() {
        // Toteuta logiikka
        return true; // Oletetaan, että toiminto onnistuu
    }

    @Override
    public boolean unMute() {
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