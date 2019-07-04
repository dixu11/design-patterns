package decorator.external.loggin;

import pl.sda.creational.singleton.Logger;

public class RaportingDecorator extends Calculator {
    private final Calculator calculator;

    public RaportingDecorator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int dodaj(int a, int b) {
        Logger.getInstance().logMessage("Proszę o uwagę, będę liczył");
        int result = calculator.dodaj(a, b);
        Logger.getInstance().logMessage("Policzone, dziękuję");
        return result;

    }
}
