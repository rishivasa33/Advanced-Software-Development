package bad.interfacesegregation;

import java.util.List;

public interface ISpotifyPlayer {

    String getTitle();

    List<String> getArtists();

    String getAlbum();

    String getNarrator();

    String getSeason();

    String getEpisode();

}
