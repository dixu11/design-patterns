package abstract_factory;

public class FabrykaWysRozdz extends FabrykaSter {
    @Override
    public SterownikEkranu pobierzSterEkr() {
        return new SterEkrWysRozdz(new SEWR());
    }

    @Override
    public SterownikDrukarki pobierzSterDruk() {
        return new SterDrukWysRozdz(new SDWR());
    }
}
