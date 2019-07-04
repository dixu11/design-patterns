package factory_method;

public abstract class SzablonZapytania {

    // metoda szablonowa, nadaje konkretną strukturę algorytmu. Poszczególne kroki są implementowane w klasach
    // dziedziczących
    public String wykonajZapytanie(String nazwaBD, String specZapyt){
        String komendaBD;
        komendaBD = formatujConnect(nazwaBD);
        komendaBD += " : ";
        komendaBD += formatujSelect(specZapyt);
        BazaDanych bazaDanych =  utworzBD();
        String rekordy = bazaDanych.przekazZapytanie(komendaBD); // używam zmiennej, aby kod był czytelniejszy
        return rekordy;
    };

    protected abstract String formatujConnect(String nazwaBD);

    // metoda w przypadku bazy Oracle dodaje ";" a w przypadku SQL nic nie zmienia
    protected abstract String formatujSelect(String specZapyt);
    public abstract BazaDanych utworzBD();
}
