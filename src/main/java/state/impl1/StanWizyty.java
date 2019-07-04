package state.impl1;

public class StanWizyty implements Stan {

    @Override
    public void nastepny(Pacjent pacjent) {
        System.out.println("Brak kolejnego stanu!");
    }

    @Override
    public void poprzedni(Pacjent pacjent) {
    pacjent.setStan(new StanKolejki());
    }

    @Override
    public void wydrukujStatus() {
        System.out.println("Pacjent na wizycie");
    }
}
