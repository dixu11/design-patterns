package state.impl2;

public interface FileState {
    public void open(File file);

    public void close(File file);

    public void read();

    public void write();

    public String whatState();
}
