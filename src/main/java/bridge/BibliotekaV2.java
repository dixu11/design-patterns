package bridge;

public class BibliotekaV2 extends Biblioteka {

    private BG2 bg2 = new BG2();

    public void rysujLinie() {
        bg2.narysujLinie();
    }


    public void rysujOkrag() {
        bg2.narysujOkrag();
    }
}
