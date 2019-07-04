package strategy.impl1;

public class PodatekNiemcy extends  ObliczPodatek  {
    // podatek wyliczany dla Polski 0,17% od ceny towarów
    public double kwotaPodatku(double[] ceny) {
        double sumaCen = 0;
        for (double cena : ceny) {
            sumaCen += cena;
        }
        return sumaCen*0.17;
    }
}
