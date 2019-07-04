package facade;/*
Zad. 4 (fasada)
        Zaimplementuj klasę Wektor3D reprezentującą wektor w przestrzeni 3D
        (wystarczy jeden konstruktor oraz przeładowany operator +,
         ewentualnie operator *, realizujące odpowiednio dodawanie wektorów
          oraz mnożenie przez skalar).
        Zaimplementuj fasadę Wektor2D na klasę Wektor3D.
        Zaimplementuj prosty program wykonujący kilka operacji na
        wektorach 2D za pomocą stworzonej fasady.
*/

public class TestFacade {
    public static void main(String[] args) {
        //  -- test klasy Wektor3D --
        Wektor w1 = new Wektor3D(3, 3, 3);
        Wektor w2 = new Wektor3D(2, 2, 2);
        w1.add(w2);
        System.out.println(w1);
        w1.scale(w2);
        System.out.println(w1);

        //  -- test klasy FacadeWektor2D --
        Wektor w3 = FacedeWektor2D.createWektor(3, 3);
        Wektor w4 = FacedeWektor2D.createWektor(2, 2);
        w3 = FacedeWektor2D.addVectors(w3, w4);
        System.out.println(w3);
        w3 = FacedeWektor2D.scaleVectors(w3, w4);
        System.out.println(w3);
    }
}
