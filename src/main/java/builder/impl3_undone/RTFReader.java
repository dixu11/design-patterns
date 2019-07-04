package builder.impl3_undone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RTFReader {
    private TextConverter textConverter;
    private final Konfiguracja konfiguracja;

    public RTFReader(Konfiguracja konfiguracja) {
        this.konfiguracja = konfiguracja;
        textConverter = konfiguracja.getActualTextConverter();
    }

    public Text parseRTF(String tekstZPliku) {
        Scanner reader = new Scanner(tekstZPliku);

//        while (reader.hasNext()) {
            // zadanie wymaga w tym miejscu zastosowania regexów -
            // niestety nie mam ich jeszcze opanowanych i nie wiem jak to zrobić

//            System.out.println(reader.next());
//        }
        // w tym miejscu stworzyłem listę która symuluje posegregowane przez wcześniejszą pętlę z regexami pozycje
        // wstawiłem do niej obiekty z informacją jakiego z 3 typów są i z ich treścią
        List<FragmentWyrazu> fragmenty = new ArrayList<>();
        fragmenty.add(new FragmentWyrazu("A", TypWyrazenia.CHARACTER));
        fragmenty.add(new FragmentWyrazu("<b>", TypWyrazenia.HTML));
        fragmenty.add(new FragmentWyrazu("l", TypWyrazenia.CHARACTER));
        fragmenty.add(new FragmentWyrazu("a", TypWyrazenia.CHARACTER));
        fragmenty.add(new FragmentWyrazu("\n", TypWyrazenia.NEW_LINE));
        fragmenty.add(new FragmentWyrazu("m", TypWyrazenia.CHARACTER));
        fragmenty.add(new FragmentWyrazu("a", TypWyrazenia.CHARACTER));
        fragmenty.add(new FragmentWyrazu("\n", TypWyrazenia.NEW_LINE));
        fragmenty.add(new FragmentWyrazu("<i>", TypWyrazenia.HTML));
        fragmenty.add(new FragmentWyrazu("k", TypWyrazenia.CHARACTER));
        fragmenty.add(new FragmentWyrazu("o", TypWyrazenia.CHARACTER));
        fragmenty.add(new FragmentWyrazu("<u>", TypWyrazenia.HTML));
        fragmenty.add(new FragmentWyrazu("t", TypWyrazenia.CHARACTER));
        fragmenty.add(new FragmentWyrazu("a", TypWyrazenia.CHARACTER));

        // pętla ta wysyła poszczególne elementy posegregowanej listy do odpowiadających im metod buildera
        for (FragmentWyrazu fragmentWyrazu : fragmenty) {
            switch (fragmentWyrazu.getTyp()) {
                case NEW_LINE:
                    textConverter.convertParagraph();
                    break;
                case HTML:
                    textConverter.convertFontChange(fragmentWyrazu.getTresc());
                    break;
                case CHARACTER:
                   textConverter.convertCharacter(fragmentWyrazu.getTresc().charAt(0));
                    break;
            }
        }
        // zwracam gotowy zbudowany obiekt typu Text
        return textConverter.getConvertedText();
    }


    void update() {
        textConverter = konfiguracja.getActualTextConverter();
    }
}
