package facade;// klasa interfejs nie jest częścią wzorca fasada, użyłem ją, aby nie trzeba było
// zwracać się do referencji wektorów 2D pisząc typ danych: Wektor3D
// jedynie samo: Wektor

interface Wektor {
    void add(Wektor wektor2);

    void scale(Wektor wektor2);

    int getX();

    int getY();

    int getZ();
}
