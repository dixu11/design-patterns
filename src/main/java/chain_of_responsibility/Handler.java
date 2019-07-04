package chain_of_responsibility;

public abstract class Handler {
    // każdy handler ma dostęp do kolejnego
    protected Handler nextHandler;

    public abstract void handleHelp();
    protected abstract void showHelp();

    // umożliwiłem ręczne przypinanie handlera aby dodać więcej elastyczności w łączeniu ich ze sobą
    public void connectToOtherHandler(Handler handler) {
        nextHandler = handler;
    }
}
