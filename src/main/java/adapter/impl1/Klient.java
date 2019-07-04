package adapter.impl1;/*Zad. 1 (adapter)
        Na podstawie poniższego rysunku zaimplementuj klasę Figura oraz jej
        klasy pochodne (wystarczą 2 klasy pochodne z tylko jedną „gadatliwą”
        metodą wyświetl() tzn. wypisującą w trybie tekstowym odpowiedni komunikat
        np. „Rysuję linię”).
        Zaimplementuj klasę XXOkrag z gadatliwą metodą wyświetlaj().
        Zaimplementuj adapter Okrag dostosowujący interfejs XXOkrag do interfejsu Figury.
        Zaimplementuj prosty program wyświetlający konkretne figury, w tym
        Okrag, z wykorzystaniem polimorfizmu.*/

public class Klient {
    public static void main(String[] args) {
        // Wykorzystanie polimorfizmu - do wszystkich figur zwaracam się po referencji
        // figury natomiast poszczególne obiekty zachowują się na swój sposób
        Figura kwadrat = new Kwadrat();
        Figura linia = new Linia();
        Figura okrag1 = new Okrag();

        // do stworzenia XXOkrag jako figury potrzebuje przekazac go adapterowi
        // umozliwia to traktowanie go tak jakby był kazda inna figura
        Figura okrag2 = new OkragAdapter(new XXOkrag());

        // testuje dzialanie obiektow
        kwadrat.wyswietl();
        linia.wyswietl();

        // mimo ze oba okregi implementuja wyswietlanie po swojemu dzieki adapterowi
        // mozemy je wywołać bez względu na niezgodne sygnatury metod
        okrag1.wyswietl();
        okrag2.wyswietl();
    }
}
