package decorator.external.loggin;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.dodaj(5, 3);


        Calculator raportingDecorator = new RaportingDecorator(new LoggingDecorator(new Calculator()));
        raportingDecorator.dodaj(23, 23);

    }


}
