package chain_of_responsibility;

public class aPrintDialog extends Handler {
    @Override
    public void handleHelp() {
        showHelp();
        nextHandler.handleHelp();
    }

    @Override
    protected void showHelp() {
        System.out.println("Print Dialog: Nie potrafię obsłużyć zapytania, przekazuję dalej");
    }
}
