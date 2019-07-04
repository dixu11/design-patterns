package adapter.external;

public class AdapterDemo {
    public static void main(String[] args) {
        AnimalPlanet animalPlanet = new AnimalPlanet();
        animalPlanet.makeSound(new Duck());
        animalPlanet.makeSound(new MechanicalDuckAdapter( new MechanicalDuck()));

    }
}
