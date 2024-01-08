public class Puhelin {
    private ITelephoneMic mikrofoni;
    private ITelephoneSpeaker kaiutin;

    public void setMikrofoni(ITelephoneMic mikrofoni) {
        this.mikrofoni = mikrofoni;
    }

    public ITelephoneMic getMikrofoni() {
        return mikrofoni;
    }

    public void setKaiutin(ITelephoneSpeaker kaiutin) {
        this.kaiutin = kaiutin;
    }

    public ITelephoneSpeaker getKaiutin() {
        return kaiutin;
    }
}
