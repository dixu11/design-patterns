package composite;/* wzorzec projektowy Composite pozwala stworzyć drzewo danych, w których znajdują się dwa rodzaje obiektów -
obiekty typu kompozycji, czyli takie, które zawierają referencję do innych obiektów tego samego typu - dzieci
a także obiekty typu liści - końcowe odnogi stworzonego drzewa, które nie zawierają dalszych referencji.
Dzięki takiej strukturze projektu jesteśmy w stanie nawet skomplikowane algorytmy przeglądające taką strukturę
napisać w prosty i szybki sposób dzięki rekurencji. Przykłądowym zastosowaniem może być wizualizacja drzewa folderów
albo to do listy z zadaniami rozbitymi na mniejsze zadania.
 */

public class Klient {
    public static void main(String[] args) {
        // tworzę obiekt, który będzie posiadał referencje do kolejnych obiektów które mu przypiszę
        Picture picture2 = new Picture();
        picture2.add(new Text());
        picture2.add(new Line());
        picture2.add(new Rectangle());

        //tworzę kolejny obiekt, wyżej w hierarchii, w którym zawrę popzedni obiekt a także inne
        Picture picture1 = new Picture();
        picture1.add(new Line());
        picture1.add(new Rectangle());
        picture1.add(picture2);
        picture1.add(new Line());

        // za pomocą jednej metody jestem w stanie odpalić metody draw wszystkich stworzonych obiektów
        picture1.draw();
    }
}
