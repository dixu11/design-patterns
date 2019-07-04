package state.impl1;

public class StanKolejki implements Stan {
    @Override
    public void nastepny(Pacjent pacjent) {
        pacjent.setStan(new StanWizyty());
    }

    @Override
    public void poprzedni(Pacjent pacjent) {
    pacjent.setStan(new StanRejestacji());
    }

    @Override
    public void wydrukujStatus() {
        System.out.println("Pacjent w kolejce");
    }
}
