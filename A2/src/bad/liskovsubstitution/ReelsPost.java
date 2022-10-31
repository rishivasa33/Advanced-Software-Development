package bad.liskovsubstitution;

public class ReelsPost extends FacebookPost {
    int replays = 1000;

    @Override
    public int getLikeCount() {
        likes = 500;
        return likes;
    }

    @Override
    public int getViewsCount() {
        views = 2000;
        views = views + replays;
        return views;
    }

    @Override
    public String getAudioUsed() {
        audioUsed = "Sultans of Swing";
        return audioUsed;
    }
}
