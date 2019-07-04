package strategy.impl1;

public class Zamowienie {
    // przy obecnej konstrukcji można z tego pola zrezygnować, pozwala ono jednak odczytać konfiguracje
    // jesli zaimplementujemy getter
    private Konfiguracja konfiguracja;
    // pole przechowuje obiekt obliczający podatek. To jaki jego rodzaj zostanie przypisany zależy od konfiguracji
    private ObliczPodatek obliczPodatek;
    private double[] artykuly;

    public Zamowienie(double[] artykuly, Konfiguracja konfiguracja) {
        this.artykuly = artykuly;
        this.konfiguracja = konfiguracja;
        // od razu przy tworzeniu instancji dzięki konfiguracji dopasowuję właściwy sposób obliczania podatku
        obliczPodatek = konfiguracja.wygenerujNarzedzie();
    }

    // proszę odpowiedni obiekt o wyliczenie podatku na swój sposób zależny od konfiguracji
    public double obliczPodatek() {
        return obliczPodatek.kwotaPodatku(artykuly);
    }
}
