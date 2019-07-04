package strategy.impl1;

public class Konfiguracja {

    //dobrze by było zastąpić enumem
   private String panstwo;

    public Konfiguracja(String panstwo) {
        //konfiguracje różnią się od siebie państwem dla którego chcemy obliczać podatek
        this.panstwo = panstwo;
    }

    // metoda pozwalająca uzyskać odpowiednie narzędzie w zależności od zadanej konfiguracji
    public ObliczPodatek wygenerujNarzedzie() {
        // wybrałem switch ponieważ łatwo dodać nowe państwa
        switch (panstwo){
            case "Polska":
                return new PodatekPolska();
            case "Niemcy":
                return new PodatekNiemcy();
            default:
                System.out.println("Błąd - nieprawidłowe lub nieobsługowane państwo. " +
                        "Ustawiam domyślny sposób obliczania podatku - Polska");
                return  new PodatekPolska();
        }
    }

    // pozwala zmienić konfigurację gdy już mamy stworzony obiekt
    public Konfiguracja setPanstwo(String panstwo) {
        this.panstwo = panstwo;
        return this;
    }
}
