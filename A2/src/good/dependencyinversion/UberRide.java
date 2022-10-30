package good.dependencyinversion;

import java.util.HashMap;

public class UberRide {

    private HashMap<String, String> sourceCoordinates;
    private HashMap<String, String> destinationCoordinates;

    public HashMap<String, String> getSourceCoordinates(String sourceAddress, ICoordinates googleMapsAPi) {
        sourceCoordinates = googleMapsAPi.fetchLocationCoordinates(sourceAddress);
        return sourceCoordinates;
    }

    public HashMap<String, String> getDestinationCoordinates(String destinationAddress, ICoordinates appleMapsApi) {
        destinationCoordinates = appleMapsApi.fetchLocationCoordinates(destinationAddress);
        return destinationCoordinates;
    }
}

