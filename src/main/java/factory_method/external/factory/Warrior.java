package factory_method.external.factory;

import pl.sda.creational.singleton.Logger;

public class Warrior {
    private final String nickname;
    private int lvl;
    private Profession profession;
    private Weapon weapon;
    private WeaponFactory weaponFactory;

    public Warrior(String nickname, int lvl, Profession profession) {
        this.nickname = nickname;
        this.lvl = lvl;
        this.profession = profession;
        weaponFactory = new WeaponFactory();
        weaponFactory.makeWeapon(profession, 5);

    }




    // pozbyliśmy się tysiąca ifuw i elsów - one dalej sa ale sa schowane dlatego nasza kliencka maetoda jest czystsza
    public void changeProfession(Profession newProffesion) {
        profession = newProffesion;
        weaponFactory.makeWeapon(profession,5);
        Logger.getInstance().logMessage("Changing profession and weapon");
    }

    // jeżlei tworzymy jakiś obiekt w zależności od jakiegoś kryterium i mamy dużo ifów wtedy jest czas na abstrakcyjna fabryke

}
