package template_method.impl1;

public class Klient {
    // wzorzec projektowy Template Method zakłada wydzielenie poszczególnych kroków z algorytmu ich konkretnej
    // implementacji. Dzięki temu jedno i drugie można modyfikować niezależnie od siebie a także tworzyć
    // różne wersje implementacji algorytmu, tak jak w tym zadaniu

    public static void main(String[] args) {
        //tworzę instancję zapytania
        SzablonZapytania zapytanie1 = new ZapytanieSQLServer();
        //wykonuję zapytanie i pobieram zwracane rekordy
        String rekordy = zapytanie1.wykonajZapytanie("BazaXB876", "podaj rekordy");
        System.out.println(rekordy);

        SzablonZapytania zapytanie2 = new ZapytanieOracle();
        String rekordy2 = zapytanie2.wykonajZapytanie("BazaXB876", "podaj rekordy");
        System.out.println(rekordy2);


    }
}
