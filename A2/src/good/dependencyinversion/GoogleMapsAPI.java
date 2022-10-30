package good.dependencyinversion;

import java.util.HashMap;

public class GoogleMapsAPI implements ICoordinates {
    public HashMap<String, String> fetchLocationCoordinates(String location) {
        HashMap<String, String> coOrdinates = new HashMap<>();
        //Hardcoded Values, simulating an API Call to Google Maps
        coOrdinates.put("LATITUDE", "44.63837581675075");
        coOrdinates.put("LONGITUDE", "-63.58782956458204");
        return coOrdinates;
    }
}
