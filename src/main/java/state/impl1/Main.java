package state.impl1;

public class Main {
    public static void main(String[] args) {
        Pacjent pacjent = new Pacjent();
        pacjent.drukujStatus();

        pacjent.poprzedni();
        pacjent.drukujStatus();

        pacjent.nastepny();
        pacjent.drukujStatus();

        pacjent.nastepny();
        pacjent.drukujStatus();

        pacjent.nastepny();
        pacjent.drukujStatus();
    }
}
