public interface ITelephoneMic {
    boolean micOn();
    boolean micOff();
    void setVolume(int volume);
    int getVolume();
}