package factory_method;

public class Klient {

   /*  rozbudowane zadanie Template Method przy użyciu wzorca Factory Method
     wzorzec ten pozwala oddelegować tworzenie obiektu do konkretnej metody lub klasy dając dużo większą kontrolę
     nad tworzeniem obiektu. Jeśli chcemy dodać dużo różnych warunków i kodu do tworzenia obiektu nie musimy ich
     powtarzać przy każdej okazji gdy chcemy go stworzyć. Wystarczy że odwołamy się do metody. */


    public static void main(String[] args) {
        //tworzę instancję zapytania
        SzablonZapytania zapytanie1 = new ZapytanieSQLServer();
        //wykonuję zapytanie i pobieram zwracane rekordy
        String rekordy = zapytanie1.wykonajZapytanie("BazaXB876", "podaj rekordy");
        System.out.println(rekordy);

        SzablonZapytania zapytanie2 = new ZapytanieOracle();
        String rekordy2 = zapytanie2.wykonajZapytanie("BazaIMLS24", "podaj rekordy");
        System.out.println(rekordy2);


    }
}
