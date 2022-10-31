package bad;

import bad.liskovsubstitution.ReelsPost;
import bad.liskovsubstitution.TextPost;

public class MainBadLiskovSubstitution {
    public static void main(String[] args) {

        System.out.println("\nShowcasing a violation of Liskov's Substitution Principle: \n");

        TextPost textPost = new TextPost();
        ReelsPost reelsPost = new ReelsPost();

        System.out.println("Text Post ID: " +textPost.getPostID());
        System.out.println("Text Post Likes Count: " +textPost.getLikeCount());
        System.out.println("Text Post Views Count: " + textPost.getViewsCount());
        System.out.println("Text Post Audio Used: " + textPost.getAudioUsed());

        System.out.println("Reels Post ID: " + reelsPost.getPostID());
        System.out.println("Reels Post Likes Count: " + reelsPost.getLikeCount());
        System.out.println("Reels Post Views Count (including Replays): " + reelsPost.getViewsCount());
        System.out.println("Reels Post Audio Used: " + reelsPost.getAudioUsed());
    }
}
