public class Main {
    public static void main(String[] args) {
        // Luodaan mikrofoni ja kaiutin -oliot
        Mikrofoni mikrofoni = new Mikrofoni();
        Kaiutin kaiutin = new Kaiutin();

        // Testataan mikrofonin toimintaa
        mikrofoni.setVolume(5);
        System.out.println("Mikrofonin äänenvoimakkuus: " + mikrofoni.getVolume());
        System.out.println("Mikrofoni päällä: " + mikrofoni.micOn());
        System.out.println("Mikrofoni pois päältä: " + mikrofoni.micOff());

        // Testataan kaiuttimen toimintaa
        kaiutin.setVolume(7);
        System.out.println("Kaiuttimen äänenvoimakkuus: " + kaiutin.getVolume());
        System.out.println("Kaiutin mykistetty: " + kaiutin.mute());
        System.out.println("Kaiutin ääni päällä: " + kaiutin.unMute());
    }
}
