package abstract_factory;

public class SterEkrWysRozdz extends SterownikEkranu {
   private SEWR sewr;

    public SterEkrWysRozdz(SEWR sewr) {
        this.sewr = sewr;
    }

    @Override
    public void rysujFigure(String figura) {
        sewr.rysowanieFigury(figura);
    }
}
