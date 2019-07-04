package factory_method;

public class SQLServer implements BazaDanych {
    @Override
    public String przekazZapytanie(String zapytanie) {
        System.out.println("Przekazuję do bazy SQLServer następujące zapytanie: ");
        System.out.println(zapytanie);
        return "#wygenerowane przez baze SQL rekordy";
    }
}
