package state.impl1;

public interface Stan {
    void nastepny(Pacjent pacjent);
    void poprzedni(Pacjent pacjent);
    void wydrukujStatus();
}
