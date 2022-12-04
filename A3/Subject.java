//This is the abstract Subject upon BoardComponent objects can attach themselves
//Rob's in-class example was referred for this class

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Subject {

    private List<IObserver> listOfObservers;

    private Map<String, Object> keyValueMap;

    public Subject() {
        listOfObservers = new ArrayList<>();
        keyValueMap = new HashMap<>();
    }

    public void attach(IObserver observer) {
        listOfObservers.add(observer);
    }

    public void detach(IObserver observer) {
        listOfObservers.remove(observer);
    }

    public void notifyObservers() {
        for (IObserver listOfObserver : listOfObservers) {
            listOfObserver.update(this);
        }
    }

    public void setValue(String key, Object value) {
        keyValueMap.put(key, value);
    }

    public Object getValue(String key) {
        return keyValueMap.get(key);
    }

}
