package good.liskovsubstitution;

public class ReelsPost extends MultimediaPost {
    int replays = 1000;

    @Override
    public int getLikeCount() {
        likes = 5120;
        return likes;
    }

    @Override
    public int getTotalViewsCount() {
        totalViews = 8720;
        totalViews = totalViews + replays;
        return totalViews;
    }

    @Override
    public String getAudioUsed() {
        audioUsed = "Sultans Of Swing";
        return audioUsed;
    }
}
