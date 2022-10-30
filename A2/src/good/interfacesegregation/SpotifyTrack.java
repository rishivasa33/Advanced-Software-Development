package good.interfacesegregation;

import java.util.ArrayList;
import java.util.List;

public class SpotifyTrack implements ISpotifyPlayer, ISpotifyTracks {

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
    public String toString() {
        return "title='" + getTitle() + '\'' + "\n" +
                "artists=" + getArtists() + "\n" +
                "album='" + getAlbum() + '\'' + "\n";
    }
}
