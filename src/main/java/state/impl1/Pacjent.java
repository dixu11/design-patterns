package state.impl1;

public class Pacjent {

    private Stan stan;

    public Pacjent() {
        stan = new StanRejestacji();
    }

    public void nastepny() {
        stan.nastepny(this);
    }
    public void poprzedni() {
        stan.poprzedni(this);
    }
    public void drukujStatus() {
        stan.wydrukujStatus();
    }

    public void setStan(Stan stan) {
        this.stan = stan;
    }

    public Stan getStan() {
        return stan;
    }
}
