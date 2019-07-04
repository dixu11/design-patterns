package builder.impl2;

import java.time.LocalDate;
import java.util.Objects;

public class Person implements Comparable<Person> {

    private int id;
    private String name;
    private int age;
    private LocalDate birthDate;
    private String adres;

    private static int nextId;

    private Person(String name) {
        this.name = name;
    }


    public static PersonBuilder createCustomPerson(String imie) {
       return new PersonBuilder(imie);
    }


    public static class PersonBuilder{
        private Person person;

        public PersonBuilder(String imie) {
            person = new Person(imie);
        }

        public PersonBuilder withId(int id) {
            person.id = id;
            return this;
        }

        public PersonBuilder withAge(int age) {
            person.age = age;
            return this;
        }

        public PersonBuilder livingIn(String adres) {
            person.adres = adres;
            return this;
        }

        public PersonBuilder bornIn(LocalDate date) {
            person.birthDate = date;
            return this;
        }

        public Person create() {
            return person;
        }


    }






    public void przywitajSie() {
        System.out.println("Witam, jestem " + name);
    }

    private void determineId() {
        id = nextId++;
    }

    public String getName() {
        return name;
    }

    public String getAdres() {
        return adres;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getId() {
        return id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                name.equals(person.name) &&
                birthDate.equals(person.birthDate) &&
                adres.equals(person.adres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, birthDate);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birthDate=" + birthDate +
                ", adres=" + adres +
                '}';
    }


    @Override
    public int compareTo(Person o) {
        return Integer.compare(id, o.id);
    }

// moze byc prywatna - nie dostępna w innych klasach
// może być statyczna - nie związana z obiektem
// może być wiele publicznych
// tylko statyczna e może zawierać statyczne elementy

// niestatyczna klasa wew. ma dostęp do wszystkiego z klasy zewnętrznej

}



