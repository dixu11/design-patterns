package factory_method.external.factory;

public class WeaponFactory {

    // fabryka abstrakcyjna polega na wyrzuceniu tej metody do klasy
    public Weapon makeWeapon(Profession profession, int damage) {
        switch (profession) {
            case ARCHER:
                return new Sword(damage);
            case SWORDSMAN:
                return new Bow(damage);
            case WIZARD:
                return new Wand(damage);
            default:
                throw new IllegalStateException("There's no such weapon");
        }
    }
}
