package bridge;

public class Okrag extends Figura {


    public Okrag(Biblioteka biblioteka) {
        super(biblioteka);
    }
    // dzieki tej metodzie upraszczam sposob uzywania obiektu Okrag i wykorzystuję most
    public void rysuj() {
        biblioteka.rysujOkrag();
    }
}
