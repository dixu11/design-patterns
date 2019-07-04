package builder.impl3_undone;

public class BuilderDemo {
    /*Wzorzec builder polega na stworzeniu osobnej klasy odpowiedzialnej za tworzenie obiektu, umożliwiającej
    rozbudowane, wieloetapowe tworzenie obiektu. Dzięki temu nie tylko jesteśmy w stanie uniknąć tworzenia
    bardzo wielu konstruktorów do każdej możliwej kombinacji budowy ale także możemy niektóre z elementów
    powtarzać wielokrotnie.
    * */

    public static void main(String[] args) {
        //moja implementacja wzorca Strategii przypomina w tym przypadku nieco wzorzec Obserwer
        Konfiguracja konfiguracja = new Konfiguracja();
        RTFReader rtfReader = new RTFReader(konfiguracja);

        // konfiguracja pierwsza - normalne litery i pominięty HTML
        konfiguracja.changeConvertingStrategy(ConversionType.ASCI,rtfReader);
        Text tekst1 =  rtfReader.parseRTF("A<b>l</b>a ma <i>k</i>o<u>t</u>a");
        System.out.println(tekst1.getText());
        System.out.println();

        // konfiguracja druga - duże litery tam gdzie tagi i pominięty HTML
        konfiguracja.changeConvertingStrategy(ConversionType.ASCI_CAPITAL,rtfReader);
        Text tekst2 =  rtfReader.parseRTF("A<b>l</b>a ma <i>k</i>o<u>t</u>a");
        System.out.println(tekst2.getText());
        System.out.println();

        // konfiguracja trzecia - duże litery tam gdzie tagi i HTML zostaje
        konfiguracja.changeConvertingStrategy(ConversionType.HTML_CAPITAL,rtfReader);
        Text tekst3 =  rtfReader.parseRTF("A<b>l</b>a ma <i>k</i>o<u>t</u>a");
        System.out.println(tekst3.getText());
        System.out.println();

        // konfiguracja czwarta - HTML przekształcony
        konfiguracja.changeConvertingStrategy(ConversionType.WIDGET,rtfReader);
        Text tekst4 =  rtfReader.parseRTF("A<b>l</b>a ma <i>k</i>o<u>t</u>a");
        System.out.println(tekst4.getText());

        ConversionType enum1 = ConversionType.ASCI;
        ConversionType enum2 = ConversionType.valueOf("ASCI");
        System.out.println("Moj enum: " + enum2);
        Enum<ConversionType> mojEnum = enum1;

        TypWyrazenia mojEnumNadpisujacy = TypWyrazenia.CHARACTER;
        mojEnumNadpisujacy.metoda();
    }
}
