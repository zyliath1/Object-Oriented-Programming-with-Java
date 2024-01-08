public class BroadcomMikrofoni implements ITelephoneMic {
    private int volume;

    @Override
    public boolean micOn() {
        return volume <= 100;
    }

    @Override
    public boolean micOff() {
        // Toteuta logiikka
        return true;
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