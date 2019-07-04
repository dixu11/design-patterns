package state.impl2;/*Wzorzec projektowy state pozwala zmienić zachowanie obiektu w zależności od stanu w jakim się znajduje.
Stan ten definiuje jego pole kompozycji i do niego odnosi się starając się uruchomić wszelkie zachowania, które
są zależne od jego stanu. Wzorzec ten można zastosować jeszcze np do menu instalatora, którego stan zmienia
się po każdym kliknięciu przycisku next lub back.
* */

public class StateDemo {
    public static void main(String[] args) {
        // tworze obiekt reprezentujący plik - domyślnie plik jest zamknięty
        File file = new File();

        // te metody wyświetlą komunikaty o błędzie ponieważ w tym stanie te funkcje nie powinny być możliwe
        file.read();
        file.write();
        file.close();

        //po użyciu metody open stan obiektu zmienia się i tym samym zachowanie jego metod wywołanych wcześniej też
        file.open();

        // obiekt zachowuje się inaczej bo zmienił się jego stan
        file.read();
        file.write();
        file.open();

        // użycie metody .close ustawia ponownie stan FileClosed i znów blokuje możliwość czytania, zapisywania i zamykania pliku
        file.close();
    }
}
