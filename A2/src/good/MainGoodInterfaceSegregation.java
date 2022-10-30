package good;

import good.interfacesegregation.SpotifyPodcast;
import good.interfacesegregation.SpotifyTrack;

public class MainGoodInterfaceSegregation {

    public static void main(String[] args) {

        System.out.println("\nShowcasing the resolution for Interface Segregation Principle: \n");

        SpotifyTrack track = new SpotifyTrack();
        System.out.println("Sample Track Details in Spotify: \n" + track.toString());

        SpotifyPodcast podcast = new SpotifyPodcast();
        System.out.println("Sample Podcast Details in Spotify: \n" + podcast.toString());

    }
}
