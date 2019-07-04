package abstract_factory;

public class SterEkrNisRozdz extends SterownikEkranu {
  private   SENR senr;

    public SterEkrNisRozdz(SENR senr) {
        this.senr = senr;
    }

    @Override
    public void rysujFigure(String figura) {
        senr.rysowanieFigury(figura);
    }
}
