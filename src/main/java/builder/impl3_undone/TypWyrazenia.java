package builder.impl3_undone;

public enum  TypWyrazenia {
    NEW_LINE{
        @Override
        public void metoda() {

        }
    }, HTML{
        @Override
        public void metoda() {

        }
    }, CHARACTER{
        @Override
        public void metoda() {

        }
    };  // typy pozwalające rozróżnić obiekty na liście które symulują selekcje po regexach na 3 zbiory

    public static int yolo = 5;

    public abstract void metoda();
}
