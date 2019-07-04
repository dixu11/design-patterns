package state.impl2;

// obiekt reprezentujący plik
public class File {
    // pole state umożliwia wykonanie metod zależne od stanu
    private FileState fileState;

    // domyślnie ustawiam status jako zamknięty plik
    public File() {
        fileState = new FileClosed();
    }

    // każda metoda pliku uzależnia swoje zachowanie od stanu, jeśli trzeba przekazuje też aktualny stan
    public void open() {
        fileState.open(this);
    }

    public void close() {
        fileState.close(this);
    }

    public void read() {
        fileState.read();
    }

    public void write() {
        fileState.write();
    }

    // metoda pozwala zmienić stan
    public File setFileState(FileState fileState) {
        this.fileState = fileState;
        return this;
    }
}
