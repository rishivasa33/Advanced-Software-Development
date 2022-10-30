package bad.dependencyinversion;

import java.util.HashMap;

public class UberRide {

    private HashMap<String, String> sourceCoordinates;
    private HashMap<String, String> destinationCoordinates;

    public HashMap<String, String> getSourceCoordinates(String sourceAddress) {
        GoogleMapsAPI googleMap = new GoogleMapsAPI();
        sourceCoordinates = googleMap.fetchLocationCoordinates(sourceAddress);
        return sourceCoordinates;
    }

    public HashMap<String, String> getDestinationCoordinates(String destinationAddress) {
        AppleMapsAPI appleMap = new AppleMapsAPI();
        destinationCoordinates = appleMap.fetchLocationCoordinates(destinationAddress);
        return destinationCoordinates;
    }
}
