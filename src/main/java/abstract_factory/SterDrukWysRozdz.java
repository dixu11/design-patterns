package abstract_factory;

public class SterDrukWysRozdz extends SterownikDrukarki {
   private SDWR sdwr;

    public SterDrukWysRozdz(SDWR sdwr) {
        this.sdwr = sdwr;
    }

    public void drukujFigure(String figura) {
       sdwr.drukowanieFigury(figura);
    }
}
