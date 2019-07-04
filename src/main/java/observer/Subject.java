package observer;

import java.util.ArrayList;
import java.util.List;

// obiekt informujący o zmianach obserwatorów
public abstract class Subject {

    // lista obserwujących
    private final List<Observer> observers;

    public Subject() {
        observers = new ArrayList<>();
    }

    // metody pozwalają na dołaczenie lub odłaczenie obserwatora
    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
    observers.forEach(Observer::update); // skrócony zapis iteracji po obserwerach i wywołania ich metody update
    }

}
