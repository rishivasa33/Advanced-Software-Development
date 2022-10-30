package bad;

import bad.dependencyinversion.UberRide;

public class MainBadDependencyInversion {
    public static void main(String[] args) {

        System.out.println("\nShowcasing a violation of Dependency Inversion Principle: \n");

        UberRide ride = new UberRide();
        String pickupAddress = "Goldberg Computer Science Building, Halifax B3J2K9";
        String destinationAddress = "Gateway Of India, Mumbai 400032";

        System.out.println("Fetching current Uber Ride's pickup co-ordinates from Google Maps API: "+ride.getSourceCoordinates(pickupAddress));
        System.out.println("Fetching current Uber Ride's destination co-ordinates from Google Maps API: "+ride.getDestinationCoordinates(destinationAddress));

    }

}
