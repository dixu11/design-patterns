package observer;

public class ObserverDemo {
    public static void main(String[] args) {

        /*Wzorzec projektowy Obserwator pozwala stworzyć jeden obiekt typu Subject, który pozwala dołączać i odłączać
        dowolną ilość obserwatorów. Za każdym razem gdy obiekt zmieni stan subject może poinformować wszystkich obserwerów
        o swoim nowym stanie za pomocą jednego wywołania metody. Eliminuje to problem ciągłego pytania obiektu przez inne
        o jego stan a przenosi odpowiedzialność za informowanie o nowościach na obiekt, którego one dotyczą.
        Przykład zastosowania - chat room w którym każdy z klientów dowiaduje sią o nowej napisanej wiadomości
        * */

        // tworze subject dając mu jakiś początkowy stan - obserwerzy nie będą o nim poinformowani bo zaczynamy bez
        // subskrybentów
        ConcreteSubject subject = new ConcreteSubject("Initial state");

        // tworzę 3 obserwerów - każdy dostaje do dostęp do subject aby mieć możliwość coś od niego pobrać gdy będzie update
        Observer observer = new ConcreteObserver(subject);
        Observer observer2 = new ConcreteObserver(subject);
        Observer observer3 = new ConcreteObserver(subject);

        // wybieram które obserwery mają otrzymywać uaktualnienia z objectu Subject
        subject.attach(observer);
        subject.attach(observer2);
        subject.attach(observer3);

        // zmieniam stan i decyduję się poinformowąc o tym obserwatorów. Mógłbym zrobić wywołanie notify w setSubject
        // jeśli chciałbym, żeby obserwerzy byli powiadamiani zawsze przy jakiejkolwiek zmianie stanu 
        subject.setSubjectState("new state!");
        subject.notifyObservers();
    }
}
