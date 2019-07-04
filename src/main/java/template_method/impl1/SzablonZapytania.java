package template_method.impl1;

public abstract class SzablonZapytania {

    // metoda szablonowa, nadaje konkretną strukturę algorytmu. Poszczególne kroki są implementowane w klasach
    // dziedziczących
    public String wykonajZapytanie(String nazwaBD, String specZapyt){
        String komendaBD;
        komendaBD = formatujConnect(nazwaBD);
        komendaBD += " : ";
        komendaBD += formatujSelect(specZapyt);
        System.out.println(komendaBD);

        String rekordy = "#wygenerowane przez baze rekordy";
        return rekordy;
    };

    // metoda nic nie zmienia
    protected abstract String formatujConnect(String nazwaBD);
    // metoda w przypadku bazy Oracle dodaje ";" a w przypadku SQL nic nie zmienia
    protected abstract String formatujSelect(String specZapyt);
}
