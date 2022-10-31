package good.liskovsubstitution;

public class ImagePost extends SimplePost{

    @Override
    public int getLikeCount() {
        likes = 1230;
        return likes;
    }

    @Override
    public int getViewsCount() {
        views =3400;
        return views;
    }
}
