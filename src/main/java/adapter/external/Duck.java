package adapter.external;

public class Duck implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Quack");
    }
}
