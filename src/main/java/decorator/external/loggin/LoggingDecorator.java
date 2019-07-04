package decorator.external.loggin;

import pl.sda.creational.singleton.Logger;

public class LoggingDecorator extends Calculator {
   private final Calculator calculator;

    public LoggingDecorator(Calculator calculator) {
        this.calculator = calculator;
    }
    @Override
    public int dodaj(int a, int b) {
        int result = calculator.dodaj(a, b);
        Logger.getInstance().logMessage(String.format("%d + %d = %d",a,b,result));
        return result;
    }
}
