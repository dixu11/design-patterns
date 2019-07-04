package factory_method.external.factory;

public abstract class Weapon {
    protected int damage;

    public Weapon(int damage) {
        this.damage = damage;
    }

    public abstract void hit();

    public int getDamage() {
        return damage;
    }
}
