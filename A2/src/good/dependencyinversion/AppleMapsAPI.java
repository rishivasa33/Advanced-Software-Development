package good.dependencyinversion;

import java.util.HashMap;

public class AppleMapsAPI implements ICoordinates{
    public HashMap<String, String> fetchLocationCoordinates(String location) {
        HashMap<String, String> coOrdinates = new HashMap<>();
        //Hardcoded Values, simulating an API Call to Google Maps
        coOrdinates.put("LATITUDE", "18.9225901");
        coOrdinates.put("LONGITUDE", "72.8343354");
        return coOrdinates;
    }
}
