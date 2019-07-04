package abstract_factory;

public class FabrykaNisRozdz extends FabrykaSter {
    @Override
    public SterownikEkranu pobierzSterEkr() {
        return new SterEkrNisRozdz(new SENR());
    }

    @Override
    public SterownikDrukarki pobierzSterDruk() {
        return new SterDrukNisRozdz(new SDNR());
    }
}
