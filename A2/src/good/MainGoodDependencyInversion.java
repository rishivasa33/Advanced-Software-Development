package good;

import good.dependencyinversion.AppleMapsAPI;
import good.dependencyinversion.GoogleMapsAPI;
import good.dependencyinversion.ICoordinates;
import good.dependencyinversion.UberRide;

public class MainGoodDependencyInversion {

    public static void main(String[] args) {
        System.out.println("\nShowcasing the resolution for Dependency Inversion Principle: \n");

        UberRide ride = new UberRide();
        String pickupAddress = "Goldberg Computer Science Building, Halifax B3J2K9";
        String destinationAddress = "Gateway Of India, Mumbai 400032";

        ICoordinates googleMapsApi = new GoogleMapsAPI();
        ICoordinates appleMapsApi = new AppleMapsAPI();

        System.out.println("Fetching current Uber Ride's pickup co-ordinates from Google Maps API: " + ride.getSourceCoordinates(pickupAddress, googleMapsApi));
        System.out.println("Fetching current Uber Ride's destination co-ordinates from Google Maps API: " + ride.getDestinationCoordinates(destinationAddress, appleMapsApi));

    }
}
