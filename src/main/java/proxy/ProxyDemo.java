package proxy;/*Wzorzec proxy pozwala podjąć jakieś działanie w trakcie oczekiwania na pełne rozwiązanie lub nawet zamiast niego, jak
w tym przypadku. Przykładowo: na facebooku pojawiają się zarysy tabel i zdjęć zanim ściągną się faktyczne dane - to
zasługa proxy.
* */

public class ProxyDemo {
    public static void main(String[] args) {
        // tworzę jako kalkulator moje proxy i ono bedzie posredniczyć w obliczeniach
        ICalculator calculator = new ProxyCalculator(new Calculator());
        // pierwsze zapytanie - proxy oddelegowuje wykonanie do kalkulatora
        Double result = calculator.count(4.0,8.0,1.0);
        System.out.println("Wynik obliczeń:" + result);
        // drugie zapytanie, proxy nie odsyła do obliczeń ponieważ zauważa, że dane są te same i zwraca zapamiętany wynik
        Double result2 = calculator.count(4.0,8.0,1.0);
        System.out.println("Wynik obliczeń:" + result2);
    }
}
