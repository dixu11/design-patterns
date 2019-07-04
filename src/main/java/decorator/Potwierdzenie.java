package decorator;

public class Potwierdzenie extends Komponent {
    @Override
    public String drukuj() {
        String tresc = "POTWIERDZENIE\n";
        System.out.print(tresc);
        // metoda przerywa rekurencję i powoduje powrót na zewnątrz kompozycji
        return tresc;
    }
}
