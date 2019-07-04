package facade;//Założeniem fasady jest posiadanie klasy, która pozwoli wykonać szereg operacji
//jednego typu. Ponieważ nie widzę potrzeby tworzenia instancji fasady, wszystkie
//jej metody stworzyłem jako narzędzia statyczne

public class FacedeWektor2D {

    //    funkcjonalność tworzenia wektorów 2D
    public static Wektor createWektor(int x, int y) {
        return new Wektor3D(x, y, 0);
    }

    // funkcjonalność dodawania wektorów 2D
    public static Wektor addVectors(Wektor wektor1, Wektor wektor2) {
        Wektor newWektor = createWektor(0, 0);
        newWektor.add(wektor1);
        newWektor.add(wektor2);
        return newWektor;
    }

    // funkcjonalność skalowania wektorów 2D
    public static Wektor scaleVectors(Wektor wektor1, Wektor wektor2) {
        Wektor newWektor = new Wektor3D(wektor1.getX(), wektor1.getY(), 0);
        newWektor.scale(wektor2);
        return newWektor;
    }
}
