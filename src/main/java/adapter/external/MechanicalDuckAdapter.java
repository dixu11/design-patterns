package adapter.external;

public class MechanicalDuckAdapter implements Animal {
    private final IMechanicalDuck mechanicalDuck;

    public MechanicalDuckAdapter(IMechanicalDuck mechanicalDuck) {
        this.mechanicalDuck = mechanicalDuck;
    }


    @Override
    public void makeSound() {
        mechanicalDuck.doMechanicalSound();
    }
}
