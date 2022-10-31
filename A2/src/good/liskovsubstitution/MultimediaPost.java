package good.liskovsubstitution;

public abstract class MultimediaPost extends FacebookPost{

    int totalViews;
    String audioUsed;
    public abstract int getTotalViewsCount();

    public abstract String getAudioUsed();
}
