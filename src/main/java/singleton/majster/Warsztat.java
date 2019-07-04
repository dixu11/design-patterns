package singleton.majster;

public class Warsztat {
    public static void main(String[] args) {

        Klucz inny = Klucz.podajKluczWCalach(7);
        Klucz klucz10 = Klucz.podajKluczWCalach(10);
        Klucz.podajKluczWCalach(10);
        Klucz.podajKluczWCalach(10);
        Klucz klucz13 = Klucz.podajKluczWCalach(13);
        Klucz.podajKluczWCalach(13);
        Klucz.podajKluczWCalach(13);
        Klucz.podajKluczWCentymetrach(30);
        Klucz.podajKluczWCentymetrach(15);
        Klucz.podajKluczWCentymetrach(10);
        Klucz.podajKluczWCentymetrach(5.2);


    }

}
