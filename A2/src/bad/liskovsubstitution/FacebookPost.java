package bad.liskovsubstitution;

import java.util.Random;

public abstract class FacebookPost {

    String postID = "FBPost";
    int likes;
    int views;
    String audioUsed;

    public String getPostID() {
        //Hardcoded post ID Counter
        Random randomNumber = new Random();
        int postCount = randomNumber.nextInt(1000 - 100) + 1000;
        postID = postID.concat(String.valueOf(postCount));
        return postID;
    }

    public abstract int getLikeCount();

    public abstract int getViewsCount();

    public abstract String getAudioUsed();
}
