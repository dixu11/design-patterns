package factory_method.external.factory;

public class Sword extends Weapon {

    public Sword(int damage) {
        super(damage);
    }

    @Override
    public void hit() {
        System.out.println("Hitting with the sword");
    }
}
