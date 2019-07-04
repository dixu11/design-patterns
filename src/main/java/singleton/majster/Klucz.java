package singleton.majster;

public class Klucz {
    private double rozmiar;
    private final static double JEDEN_CAL = 2.5;
    private static Klucz klucz_10;
    private static Klucz klucz_13;

    private Klucz(double rozmiar) {
        this.rozmiar = rozmiar;
        System.out.println("Tworze klucz: " + rozmiar);
    }

    public static Klucz podajKluczWCalach(double rozmiar) {
        if (rozmiar == 10) {
            if (klucz_10 == null) {
                klucz_10 = new Klucz(10);
            }
            return klucz_10;
        } else if (rozmiar == 13) {
            if (klucz_13 == null) {
                klucz_13 = new Klucz(13);
            }
            return klucz_13;
        } else {
            return new Klucz(rozmiar);
        }
    }



    public static Klucz podajKluczWCentymetrach(double rozmiar) {

            return podajKluczWCalach(rozmiar * JEDEN_CAL);
        }


    public double getRozmiar() {
        return rozmiar;
    }

}
