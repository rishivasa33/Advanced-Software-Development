package good.liskovsubstitution;

public class TextPost extends SimplePost{

    @Override
    public int getLikeCount() {
        likes = 300;
        return likes;
    }

    @Override
    public int getViewsCount() {
        views =1200;
        return views;
    }
}
