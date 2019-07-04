package abstract_factory;

public class Klient {
    public static void main(String[] args) {
       /*  wzorzec Abstract Factory pozwala na stworzenie fabryk, które będą tworzyć obiekty różnego typu
       (współpracujące ze sobą) pozwala to płynnie zmieniać konfiguracje w których nasz program tworzy obiekty
       np zmieniając rysowanie GUI z ciemnego trybu kolorystycznego na jasny*/

       // tworzę aplikację ze wstępną konfiguracją
        ApNazorujaca aplikacja = new ApNazorujaca(new Konfiguracja("niska"));

        // wykorzystuję ustawioną strategię
        aplikacja.wczytajSterowniki();

        // wykorzystuję wytworzone obiekty
        aplikacja.rysujFigure("koło");
        aplikacja.drukujFigure("koło");

        System.out.println("---------------");

        // ustawiam inną konfigurację
        aplikacja.zmienKonfiguracje("wysoka");

        // wykorzystuję inny rodzaj fabryki
        aplikacja.wczytajSterowniki();

        //wykorzystuję inne sterowniki
        aplikacja.rysujFigure("trapez");
        aplikacja.drukujFigure("trapez");

    }
}
