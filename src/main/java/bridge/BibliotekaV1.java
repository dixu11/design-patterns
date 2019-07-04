package bridge;

public class BibliotekaV1 extends Biblioteka {

    //używam wzorca Adapter aby dostosować sygnatury metod do z charakterystycznych dla mojego programu
    //do używanych w zewnętrznej bibliotece - adapter nie zmienia  i nie dostosowuje działania obiektu.
    // Pozwala jedynie używać
    private BG1 bg1 = new BG1();

    public void rysujLinie() {
    bg1.rysuj_linie();
    }


    public void rysujOkrag() {
    bg1.rysuj_okrag();
    }
}
