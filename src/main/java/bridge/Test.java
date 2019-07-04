package bridge;

public class Test {
    public static void main(String[] args) {
        // wzorzec projektowy Most polega na oddzieleniu abstrakcji od jej implementacji.
        // stosowanie tego wzorca pozwala dodawać nowe zasoby bez potrzeby zmieniania pozostałych części programu
        // dodatkowo, dzięki temu wzorcowi możemy tworzyć dowolne kombinacje zasobów oraz związnych z nimi abstrakcji

        // tworzę okrąg z jedną z 2 możliwych bibliotek
        Okrag okrag1 = new Okrag(new BibliotekaV1());
        Okrag okrag2 = new Okrag(new BibliotekaV2());
        // wykorzystując mój obiekt działam wyłącznie na istotnym dla mnie poziomie abstrakcji - na figurze
        // nie interesuje mnie sposób w jaki jest rysowana ani działanie biblioteki
        okrag1.rysuj();
        okrag2.rysuj();

        //analogicznie przy innej figurze
        Prostokat prostokat1 = new Prostokat(new BibliotekaV1());
        Prostokat prostokat2 = new Prostokat(new BibliotekaV2());
        prostokat1.rysuj();
        prostokat2.rysuj();
    }
}
