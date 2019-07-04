package chain_of_responsibility;

public class aPrintButton extends Handler {
    @Override
    public void handleHelp() {
        showHelp();
        nextHandler.handleHelp();
    }

    @Override
    protected void showHelp() {
        System.out.println("Print Button: Nie potrafię obsłużyć zapytania, przekazuję dalej");
    }
}
