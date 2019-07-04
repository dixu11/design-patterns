package strategy.impl1;// ponieważ na schemacie klient jedynie korzysta z zamówienia zrobiłem z niego klasę testową aby skrócić
// łańcuch przekazywania argumentów

public class Klient {
    public static void main(String[] args) {
        // wzorzec projektowy Strateg pozwala zmieniać działanie obiektu zgodnie z potrzebami
        // dzięki niemu także unikamy konieczności dodawania funkcjonalności wszystkim dziedziczonym obiektom
        // a jedynie tym które faktycznie ich potrzebują.

        // tworzę przykładową tablicę cen zamówionych artykułów
        double[] artykuly = {45.6, 23.1, 33.45};

        // tworzę instancję zamówienia przekazujac mu artykuly oraz konfigurację z konkretnym ustawieniem
        Zamowienie zamowienie = new Zamowienie(artykuly,
                new Konfiguracja("Polska"));
        //wyświetlam podatek, metoda zadziała różnie w zależności od konfiguracji
        System.out.println(zamowienie.obliczPodatek());


        Zamowienie zamowienie2 = new Zamowienie(artykuly,
                new Konfiguracja("Niemcy"));
        zamowienie2.obliczPodatek();
        System.out.println(zamowienie2.obliczPodatek());
    }
}
