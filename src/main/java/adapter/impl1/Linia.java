package adapter.impl1;

public class Linia extends Figura {
    @Override
    public void wyswietl() {
        System.out.println("Wyswietlam linie");
    }

    @Override
    public void wypelnij() {
        super.wypelnij();
    }

    @Override
    public void usun() {
        super.usun();
    }
}
