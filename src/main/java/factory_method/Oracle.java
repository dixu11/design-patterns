package factory_method;

public class Oracle implements BazaDanych {
    @Override
    // metoda symuluje działanie konkretnej BD -> przekazanie zapytania i odbior rekordow
    public String przekazZapytanie(String zapytanie) {
        System.out.println("Przekazuję do bazy Oracle następujące zapytanie: ");
        System.out.println(zapytanie);
        return "#wygenerowane przez baze Oracle rekordy";
    }
}
