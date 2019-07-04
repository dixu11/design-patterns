package strategy.impl1;

public class PodatekPolska extends ObliczPodatek {

    // podatek wyliczany dla Niemiec 0,23% od ceny towarów
    public double kwotaPodatku(double[] ceny) {
        double sumaCen = 0;
        for (double cena : ceny) {
            sumaCen += cena;
        }
        return sumaCen*0.23;
    }
}
