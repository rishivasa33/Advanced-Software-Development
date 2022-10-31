package good;


import good.liskovsubstitution.ImagePost;
import good.liskovsubstitution.ReelsPost;
import good.liskovsubstitution.TextPost;

public class MainGoodLiskovSubstitution {
    public static void main(String[] args) {
        System.out.println("\nShowcasing the resolution for Liskov's Substitution" +
                " Principle: \n");


        TextPost textPost = new TextPost();
        ReelsPost reelsPost = new ReelsPost();
        ImagePost imagePost = new ImagePost();

        System.out.println("Text Post ID: " +textPost.getPostID());
        System.out.println("Text Post Likes Count: " +textPost.getLikeCount());
        System.out.println("Text Post Views Count: " + textPost.getViewsCount());

        System.out.println("Reels Post ID: " + reelsPost.getPostID());
        System.out.println("Reels Post Likes Count: " + reelsPost.getLikeCount());
        System.out.println("Reels Post Views Count (including Replays): " + reelsPost.getTotalViewsCount());
        System.out.println("Reels Post Audio Used: " + reelsPost.getAudioUsed());

        System.out.println("Image Post ID: " + imagePost.getPostID());
        System.out.println("Image Post Likes Count: " + imagePost.getLikeCount());
        System.out.println("Image Post Views Count (including Replays): " + imagePost.getViewsCount());
    }
}
