package decorator;

public class DekoratorStopki2 extends DekoratorPotwierdzenia {
    public DekoratorStopki2(Komponent mojKomponent) {
        super(mojKomponent);
    }

    @Override
    public String drukuj() {
        return  mojKomponent.drukuj() + drkStopka();

    }

    public String drkStopka() {
        String tresc = "STOPKA 2\n";
        System.out.print(tresc);
        return tresc;
    }
}
