package adapter.external;

public class MechanicalDuck implements IMechanicalDuck {
    @Override
    public void doMechanicalSound() {
        System.out.println("doMechanicalSound");
    }
}
