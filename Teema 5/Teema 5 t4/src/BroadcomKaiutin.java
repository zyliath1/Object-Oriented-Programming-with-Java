public class BroadcomKaiutin implements ITelephoneSpeaker {
    private int volume;

    @Override
    public boolean mute() {
        return volume <= 100;
    }

    @Override
    public boolean unMute() {
        return volume <= 100;
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