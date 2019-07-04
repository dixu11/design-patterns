package factory_method.external.factory;

public class Bow extends Weapon {

    public Bow(int damage) {
        super(damage);
    }

    @Override
    public void hit() {
        System.out.println("Shooting with the bow");
    }
}
