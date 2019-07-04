package chain_of_responsibility;

public class HelperDemo {
    /*Wzorzec chain of responsibility pozwala zrobić elastyczny ciąg odpowiedzialności obiektów, przez który
    * przechodzi wywołanie i trafia zawsze do właściwego wyspecjalizowanego obiektu odpowiedzialnego za  konkretne
    * zadanie. Przykładem zastosowania może być logger Javy - dostaje zapytanie o konretnym poziomie, i każdy niższy
    * poziom przekazuje zapytanie aż trafi ona na właściwy poziom logowania*/

    public static void main(String[] args) {
        Konfiguracja konfiguracja = new Konfiguracja();

        //tworzę wszystkie handlery
        Handler printButton = new aPrintButton();
        Handler okButton = new aOkButton();
        Handler printDialog = new aPrintDialog();
        Handler saveDialog = new aSaveDialog();
        Handler anAplication = new anAplication();

        //paruję handlery tk jak na schemacie za pomocą osobnego obiektu
        konfiguracja.pairHandlers(printButton,printDialog);
        konfiguracja.pairHandlers(okButton,printDialog);
        konfiguracja.pairHandlers(printDialog,anAplication);
        konfiguracja.pairHandlers(saveDialog,anAplication);

        // odpalam zapytanie od każdej strony ze schematu
        printButton.handleHelp();
        System.out.println("       -------------");
        okButton.handleHelp();
        System.out.println("       -------------");
        saveDialog.handleHelp();
        System.out.println("       -------------");
    }
}
