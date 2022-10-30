package bad;

import bad.interfacesegregation.SpotifyPodcast;
import bad.interfacesegregation.SpotifyTrack;

public class MainBadInterfaceSegregation {

    public static void main(String[] args) {

        System.out.println("\nShowcasing a violation of Interface Segregation Principle: \n");

        SpotifyTrack track = new SpotifyTrack();
        System.out.println("Sample Track Details in Spotify: \n" + track.toString());

        SpotifyPodcast podcast = new SpotifyPodcast();
        System.out.println("Sample Podcast Details in Spotify: \n" + podcast.toString());

    }


}
