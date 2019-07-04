package bridge;

// klasa wspólna dla wszystkich moich figur
public abstract class Figura {

    // stworzyłem kompozycję, żeby mieć dostęp do metod bibliotek graficznych
    // mógłbym na sztywno przypisać tworzenie biblioteki ale chcę mieć kontrole jakie kombinacje figura - biblioteka
    // chcę uzyskać
    protected Biblioteka biblioteka;

    public Figura(Biblioteka biblioteka) {
        this.biblioteka = biblioteka;
    }

    public abstract void rysuj();

    protected void rysujLinie() {

    }

    protected void rysujOkrag() {

    }
}
