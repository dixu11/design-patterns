package state.impl2;

public class FileClosed implements FileState {
    @Override
    public void open(File file) {
            System.out.println("Otwieram plik");
            file.setFileState(new FileOpened());
    }

    @Override
    public void close(File file) {
            System.out.println("Plik jest już zamknięty");
    }

    @Override
    public void read() {
        System.out.println("Plik zamknięty - nie mogę nic odczytać");
    }

    @Override
    public void write() {
        System.out.println("Plik zamknięty - nie mogę nic zapisać");
    }

    @Override
    public String whatState() {
        return "file closed";
    }
}
