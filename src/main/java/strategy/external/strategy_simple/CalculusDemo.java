package strategy.external.strategy_simple;

public class CalculusDemo {
    public static void main(String[] args) {
        int liczba = 1;
        liczba = liczba + 1;
        liczba += 1;
        liczba -= 1;
        liczba *= 2;
        liczba /= 2;
        liczba++;


        double mojaKasa = 15.30;
        double kosztPisma = 13.00;
        boolean czyMnieStacNaCzasopismo = mojaKasa >= kosztPisma;
        System.out.println("Czy masz na pismo: " + czyMnieStacNaCzasopismo);


        double liczba1 = 33.7;
        double liczba2 = 34.7;
        double liczba3 = 3.7;

        double wynik = liczba1 + liczba2 * liczba3;

        System.out.println(liczba1 + " + " + liczba2 + " * " + liczba);







//        int liczba2 = 5;
        String slowo = "jakis tekst";
        slowo += "ciag dalszy tekstu";
        System.out.println(slowo);




        Calculus calculus = new Calculus(new SumAggregator());
        // można na randomie
        System.out.println(calculus.getCurrentNumber());
        calculus.execute(30);
        System.out.println(calculus.getCurrentNumber());
        calculus.execute(30);
        calculus.execute(50);
        System.out.println(calculus.getCurrentNumber());
        calculus.setAggregator(new MinusAggregator());
        calculus.execute(234);
        System.out.println(calculus.getCurrentNumber());
    }
}
