package bad;

import java.util.ArrayList;
import java.util.List;

public class SpotifyTrack implements ISpotifyPlayer {

    private String title = "Kashmir";
    private List<String> artists = new ArrayList<>();
    private String albumName = "Physical Graffiti";

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public List<String> getArtists() {
        artists.add("Led Zeppelin");
        return artists;
    }

    @Override
    public String getAlbum() {
        return albumName;
    }

    @Override
    public String getNarrator() {
        return "Tracks have no Narrator";
    }

    @Override
    public String getSeason() {
        return "Tracks are not categorized in seasons";
    }

    @Override
    public String getEpisode() {
        return "Tracks are not categorized as episodes";
    }

    @Override
    public String toString() {
        return "title='" + getTitle() + '\'' + "\n" +
                "artists=" + getArtists() + "\n" +
                "album='" + getAlbum() + '\'' + "\n" +
                "narrator='" + getNarrator() + '\'' + "\n" +
                "season='" + getSeason() + '\'' + "\n" +
                "episode='" + getEpisode() + '\'' + "\n";
    }
}
