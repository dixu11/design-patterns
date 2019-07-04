package observer;

public class ConcreteObserver implements Observer {

    private final ConcreteSubject concreteSubject;
    private String observerState;
    private final int id;
    private static int nextId = 1;


    public ConcreteObserver(ConcreteSubject concreteSubject) {
        this.concreteSubject = concreteSubject;
        observerState = concreteSubject.getSubjectState();
        // dzięki unikatowym ID łatwo odróżnię obserwatorów
        id = nextId;
        nextId++;
    }

    //metoda wywoływana przez subject w takcie poinformowania o zmianach, dzięki niej obserwator pobiera nowy stan
    public void update() {
        System.out.printf("Obserwer nr: %d\nZgłaszam znianę stanu obiektu obserwowanego na: \n",id);
        observerState = concreteSubject.getSubjectState();
        System.out.println(observerState + "\n");
    }
}
