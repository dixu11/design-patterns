package builder.external.builder;

import java.time.LocalDate;

public class Customer {

    private String name;
    private String lastName;
    private LocalDate birthDate;
    private String pesel;
    private String profession;
    private String city;
    private String country;

    static {
        System.out.print("haha@");
    }

    private Customer() {
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", pesel='" + pesel + '\'' +
                ", profession='" + profession + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public static Builder createEmpty(String name, String lastName) {
        return new Builder(name, lastName);
    }

    public static Builder create(String name, String lastName) {
        return new Builder(name, lastName);
    }

    public static Customer createDefault() {
        Customer customer = new Builder("", "")  // to najpierw pokazuj na przykladzie bez buildera
                .asProfession("")
                .livingInCity("")
                .livingInCountry("")
                .withBirthDate(LocalDate.now())
                .withPesel("")
                .build();
        return customer;
    }


    //najlepiej na koncu
    public static class Builder {
        private Customer customer = new Customer();  // pole z budowanym customerem od zera

        public Builder(String name, String lastName) { // mozna zmie nic na private przy polaczeniu z factory
            customer.name = name; // wymagany parametr
            customer.lastName = lastName; // wymagany parametr
            customer.birthDate = LocalDate.now(); // wprowadzenie parametru opcjonalnego

        }

    /*    public Builder makeCustomer() {
            return new Builder();
        }*/

        public Builder withBirthDate(LocalDate birthDate) {
            customer.birthDate = birthDate;
            return this;
        }

        public Builder withPesel(String pesel) {
            customer.pesel = pesel;
            return this;
        }

        public Builder asProfession(String profession) {
            customer.profession = profession;
            return this;
        }

        public Builder livingInCity(String city) {
            customer.city = city;
            return this;
        }

        public Builder livingInCountry(String country) {
            customer.country = country;
            return this;
        }

        public Customer build() {
            // jak zrobi się za duzo wymaganych parametrów to już nie robimy pimp my constructor tylko
            // robimy walidacje danych OOOO TUUUUUTAJ i rzucamy exc jeśli ktoś zbudował źle

            return customer;
        }
    }
}
