package proxy;

// prawdziwa klasa licząca
public class Calculator implements ICalculator {
    public Double count(Double number1, Double number2, Double number3) {
        double x = number2 * number2 - 4 * number1 * number3;
        if (x < 0)
            throw new IllegalArgumentException("X smaller than 0!");

        return (-number2 + Math.sqrt(x)) / (2 * number1);
    }
}
