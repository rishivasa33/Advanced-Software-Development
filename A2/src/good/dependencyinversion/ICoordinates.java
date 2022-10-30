package good.dependencyinversion;

import java.util.HashMap;

public interface ICoordinates {
    HashMap<String, String> fetchLocationCoordinates(String location);
}
