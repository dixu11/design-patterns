package decorator;

public abstract class DekoratorPotwierdzenia extends Komponent {

    protected Komponent mojKomponent;

    public DekoratorPotwierdzenia(Komponent mojKomponent) {
        this.mojKomponent = mojKomponent;
    }

    /* wg schematu powinienem w tej klasie sprawdzić w metodzie drukuj czy doszedłem do ostatniego elementu
     nie robię tego, ponieważ przy metodzie, którą zastosowałem (zwracanie Stringa i drukowanie przez pojedyncze metody)
     nie ma takiej potrzeby, ostatni obiekt po prostu nie wywoła rekurencji a całość zostaje zwrócona na sam początek.*/
}
