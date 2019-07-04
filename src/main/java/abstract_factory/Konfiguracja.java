package abstract_factory;

public class Konfiguracja {
    private String rodzajFabryki;
    private FabrykaSter fabrykaNiskiejRozdzielczosci = new FabrykaNisRozdz();
    private FabrykaSter fabrykaWysokiejRozdzielczosci = new FabrykaWysRozdz();

    public Konfiguracja(String rozdzielczosc) {
        this.rodzajFabryki = rozdzielczosc;
    }

    public void zmienKonfiguracje(String nowaKonfiguracja) {
        rodzajFabryki = nowaKonfiguracja;
    }

    public FabrykaSter dajFabryke() {
        switch (rodzajFabryki) {
            case "niska":
                return fabrykaNiskiejRozdzielczosci;
            case "wysoka":
                return fabrykaWysokiejRozdzielczosci;
            default:
                throw new IllegalArgumentException("Ustawiono niedozwoloną konfigurację");
        }
    }

}

