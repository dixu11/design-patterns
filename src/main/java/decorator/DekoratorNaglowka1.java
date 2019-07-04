package decorator;

public class DekoratorNaglowka1 extends DekoratorPotwierdzenia {
    public DekoratorNaglowka1(Komponent mojKomponent) {
        super(mojKomponent);
    }

    // metoda drukuje Stringa (pośrednio) tak jak sugeruje jej nazwa. Zwraca go również ponieważ metoda pobierzPotwierdzenie
    // oczekuje Stringa który chce zwrócić

    @Override
    public String drukuj() {
        return drkNaglowek() + mojKomponent.drukuj();
        // drukuję nagłówki przed kolejnymi komponentami aby po dojściu do potwierdzenia pojawiły się najpierw

    }

    public String drkNaglowek() {
        String tresc = "NAGLOWEK 1\n";
        System.out.print(tresc);
        return tresc;
    }
}
