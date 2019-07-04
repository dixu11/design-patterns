package chain_of_responsibility;

public class anAplication extends Handler {
    @Override
    public void handleHelp() {
        showHelp();
    }

    @Override
    protected void showHelp() {
        System.out.println("An Aplication: Potrafię obsłużyć zapytania, wyświetlam pomoc!");
    }
}
