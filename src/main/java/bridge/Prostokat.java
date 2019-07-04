package bridge;

public class Prostokat extends Figura {
    public Prostokat(Biblioteka biblioteka) {
        super(biblioteka);
    }

    // dzieki tej metodzie upraszczam sposob uzywania obiektu Okrag i wykorzystuję most
    public void rysuj() {
        biblioteka.rysujLinie();
    }
}
