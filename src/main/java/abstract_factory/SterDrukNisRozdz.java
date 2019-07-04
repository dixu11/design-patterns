package abstract_factory;// klasa jest adapterem - pozwala działać naturalnie sterownikom, u których nie zgadza się sygnatura metody

public class SterDrukNisRozdz extends SterownikDrukarki {
   private SDNR sdnr;

    public SterDrukNisRozdz(SDNR sdnr) {
        this.sdnr = sdnr;
    }

    @Override
    public void drukujFigure(String figura) {
        sdnr.drukowanieFigury(figura);
    }
}
