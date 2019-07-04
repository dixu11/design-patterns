package abstract_factory;

public class ApNazorujaca {

    private FabrykaSter fabrykaSter;
    private Konfiguracja konfiguracja;
    private SterownikDrukarki sterownikDrukarki;
    private SterownikEkranu sterownikEkranu;

    //konstrujtor od razu ustawia zadaną strategię
    public ApNazorujaca(Konfiguracja konfiguracja) {
        this.konfiguracja = konfiguracja;
        uaktualnijKonfiguracje();
    }
    // metoda pozwalająca nadpisać sterowniki na pochodzące z aktualnej fabryki (strategii)
    public void wczytajSterowniki() {
        uaktualnijKonfiguracje();
        sterownikDrukarki = fabrykaSter.pobierzSterDruk();
        sterownikEkranu = fabrykaSter.pobierzSterEkr();

    }

    // metody wywołujące zapytanie do aktualnych sterowników narysowanie/ wydrukowanie figury
    public void rysujFigure(String figura) {
        sterownikEkranu.rysujFigure(figura);
    }

    public void drukujFigure(String figura) {
        sterownikDrukarki.drukujFigure(figura);
    }

    // metoda pozwalająca zmienić działanie obiektu bez ponownego jego tworzenia
    public void zmienKonfiguracje(String rozdzielczosc) {
        konfiguracja.zmienKonfiguracje(rozdzielczosc);
        uaktualnijKonfiguracje();
    }

    private void uaktualnijKonfiguracje() {
        fabrykaSter = konfiguracja.dajFabryke();
    }


}
