package decorator;

public class Klient {
    public static void main(String[] args) {
        // stworzenie pierwszej konfiguracji
        Konfiguracja k1 = new Konfiguracja(
                new DekoratorNaglowka1(
                        new DekoratorStopki1(
                                new DekoratorStopki2(
                                        new Potwierdzenie()))));
        // ponieważ wywołująca wszystko metoda nazywa się "pobierz" musi zwracać całość jako String
        // ponieważ jednak używa ona metod "drukuj" nie tylko zwraca ona potwierdzenie ale także drukuje je

      String potwierdzenie1 =  k1.pobierzPotwierdzenie();

        System.out.println("----------------------");

        // stworzenie drugiej konfiguracji
        Konfiguracja k2 = new Konfiguracja(
                new DekoratorNaglowka1(
                        new DekoratorNaglowka2(
                                new DekoratorStopki2(
                                        new Potwierdzenie()))));

       String potwierdzenie2 = k2.pobierzPotwierdzenie();

    }
}
