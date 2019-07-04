package state.impl2;

public class FileOpened implements FileState {

    @Override
    public void open(File file) {
            System.out.println("Plik jest już otwarty");
    }

    // metoda zmienia status na zamknięty
    @Override
    public void close(File file) {
            System.out.println("Zamykam plik");
            file.setFileState(new FileClosed());
    }

    @Override
    public void read() {
        System.out.println("Czytam z pliku");
    }

    @Override
    public void write() {
        System.out.println("Zapisuję do pliku");
    }

    @Override
    public String whatState() {
        return "file opened";
    }
}
