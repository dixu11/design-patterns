package proxy;

import java.util.HashMap;
import java.util.Map;

public class ProxyCalculator implements ICalculator {
    private final Calculator calculator;
    private final Map<Integer, Double> lastNumbers;
    private Double lastResult = 0.0;

    // każdą liczbę zapisuję pod odpowiednim polem w mapie - tu tworzę początkową mapę w konstruktorze
    public ProxyCalculator(Calculator calculator) {
        this.calculator = calculator;
        lastNumbers = new HashMap<>();
        lastNumbers.put(1, 0.0);
        lastNumbers.put(2, 0.0);
        lastNumbers.put(3, 0.0);
    }


    public Double count(Double number1, Double number2, Double number3) {
        // sprawdzam czy zapytanie się nie powtarza
        if (lastNumbers.get(1).equals(number1) &&
                lastNumbers.get(2).equals(number2) &&
                lastNumbers.get(3).equals(number3)) {
            System.out.println("Proxy: Dane te same co ostatnio więc nie będę marnować pamięci");
            return lastResult;
        }
        // zapamiętuję wprowadzone liczby i wynik
        lastNumbers.put(1, number1);
        lastNumbers.put(2, number2);
        lastNumbers.put(3, number3);
        Double result = calculator.count(number1, number2, number3); // proszę prawdziwą klasę liczącą o wynik
        lastResult = result;
        return result;
    }
}
