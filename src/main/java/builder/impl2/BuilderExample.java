package builder.impl2;

import java.time.LocalDate;

public class BuilderExample {
    public static void main(String[] args) {
        // Person person = new Person("Imie");
        Person person  = Person.createCustomPerson("Radek")
                .withId(10)
                .withAge(20)
                .bornIn(LocalDate.now())
                .livingIn("Szczecin")
                .create();



        System.out.println(person);
    }
}
