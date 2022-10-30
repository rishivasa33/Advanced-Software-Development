package bad;

import java.util.ArrayList;
import java.util.List;

public class SpotifyPodcast implements ISpotifyPlayer {

    private String title = "Philosophize This!";
    private List<String> artists = new ArrayList<>();
    private String narrator = "Stephen West";
    private String season = "Season #9";
    private String episode = "Episode #096 - Is Ayn Rand A Philosopher?";


    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public List<String> getArtists() {
        artists.add("Stephen West");
        artists.add("Mike Duncan");
        return artists;
    }

    @Override
    public String getAlbum() {
        return "Podcasts are not categorized in Albums";
    }

    @Override
    public String getNarrator() {
        return narrator;
    }

    @Override
    public String getSeason() {
        return season;
    }

    @Override
    public String getEpisode() {
        return episode;
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
