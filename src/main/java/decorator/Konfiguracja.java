package decorator;

public class Konfiguracja {
// klasa ta wykorzystuje w prosty sposób wcześniejszy wzorzec - Strategia
    private DekoratorPotwierdzenia udekorowanePotwierdzenie;

    public Konfiguracja(DekoratorPotwierdzenia udekorowanePotwierdzenie) {
        this.udekorowanePotwierdzenie = udekorowanePotwierdzenie;
    }

    // metoda zwraca String tak jak sugeruje jej nazwa
    public String pobierzPotwierdzenie() {
        return udekorowanePotwierdzenie.drukuj();
    }
}
