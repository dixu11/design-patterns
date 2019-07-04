package decorator;

public class DekoratorStopki1 extends DekoratorPotwierdzenia {
    public DekoratorStopki1(Komponent mojKomponent) {
        super(mojKomponent);
    }

    @Override
    public String drukuj() {
        // drukuję stopki po potwierdzeniach, żeby zawsze pojawiły się pod koniec
       return  mojKomponent.drukuj() + drkStopka();

    }

    public String drkStopka() {
        String tresc = "STOPKA 1\n";
        System.out.print(tresc);
        return tresc;
    }
}
