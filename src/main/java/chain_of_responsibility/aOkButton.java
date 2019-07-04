package chain_of_responsibility;

public class aOkButton extends Handler {
    @Override
    public void handleHelp() {
    showHelp();
    nextHandler.handleHelp();
    }

    @Override
    protected void showHelp() {
        System.out.println("OK Button: Nie potrafię obsłużyć zapytania, przekazuję dalej");
    }
}
