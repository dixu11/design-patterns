package state.impl1;

public class StanRejestacji implements Stan {
    @Override
    public void nastepny(Pacjent pacjent) {
    pacjent.setStan(new StanKolejki());
    }

    @Override
    public void poprzedni(Pacjent pacjent) {
        System.out.println("Nie ma poprzedniego stanu pacjenta");
    }

    @Override
    public void wydrukujStatus() {
        System.out.println("Pacjent w rejestracji");
    }
}
