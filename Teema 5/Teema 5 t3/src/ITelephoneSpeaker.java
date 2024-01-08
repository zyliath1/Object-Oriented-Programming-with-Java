public interface ITelephoneSpeaker {
    boolean mute();
    boolean unMute();
    void setVolume(int volume);
    int getVolume();
}