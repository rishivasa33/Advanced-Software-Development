//This class is the concrete implementation of the subject class
//Rob's in-class example was referred for this class
public class AsteroidImpacts extends Subject {

    //Singleton instance so that each board component can use this instance to attach themselves to the Subject
    private static AsteroidImpacts uniqueInstance = null;

    private AsteroidImpacts() {
    }

    public static AsteroidImpacts instance() {
        if (uniqueInstance == null) {
            uniqueInstance = new AsteroidImpacts();
        }
        return uniqueInstance;
    }

}
