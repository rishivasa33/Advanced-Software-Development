package bad.liskovsubstitution;

public class TextPost extends FacebookPost {

    @Override
    public int getLikeCount() {
        likes = 300;
        return likes;
    }

    @Override
    public int getViewsCount() {
        views = 1500;
        return views;
    }

    @Override
    public String getAudioUsed() {
        return "No audio possible in Text Post";
    }
}
