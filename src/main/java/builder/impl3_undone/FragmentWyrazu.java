package builder.impl3_undone;// zmienna która pozwala mi przypożądkować typ treści do jednej z 3 kategorii: nowa linia, litera, html

public class FragmentWyrazu {
    protected final String tresc;
    protected final TypWyrazenia typ;

    public FragmentWyrazu(String tresc, TypWyrazenia typ) {
        this.tresc = tresc;
        this.typ = typ;
    }

    public String getTresc() {
        return tresc;
    }

    public TypWyrazenia getTyp() {
        return typ;
    }
}
