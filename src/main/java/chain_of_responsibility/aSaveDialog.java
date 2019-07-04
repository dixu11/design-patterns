package chain_of_responsibility;

public class aSaveDialog extends Handler {
    @Override
    public void handleHelp() {
        showHelp();
        nextHandler.handleHelp();
    }

    @Override
    protected void showHelp() {
        System.out.println("Save Dialog: Nie potrafię obsłużyć zapytania, przekazuję dalej");
    }
}
