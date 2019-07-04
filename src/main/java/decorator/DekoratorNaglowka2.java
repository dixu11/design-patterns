package decorator;

public class DekoratorNaglowka2 extends DekoratorPotwierdzenia {
    public DekoratorNaglowka2(Komponent mojKomponent) {
        super(mojKomponent);
    }

    @Override
    public String drukuj() {
        return drkNaglowek() + mojKomponent.drukuj();
    }

    public String drkNaglowek() {
        String tresc = "NAGLOWEK 2\n";
        System.out.print(tresc);
        return tresc;
    }
}
