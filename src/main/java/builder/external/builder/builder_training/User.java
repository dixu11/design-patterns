package builder.external.builder.builder_training;

public class User {
    private String imie;
    private int wiek;
    private String urodziny;
    private String nazwisko;

    private User() {
    }

    public static UserBuilder create() {

        return new UserBuilder();
    }

    public static class UserBuilder {
       private User user = new User();
        private UserBuilder() {
        }

        public UserBuilder withName(String name) {
            user.imie = name;
            return this;
        }

        public UserBuilder withAge(int age) {
            user.wiek = age;
            return this;
        }
        public UserBuilder bornAt(String date) {
            user.urodziny = date;
            return this;
        }
        public UserBuilder withLastName(String name) {
            user.nazwisko = name;
            return this;
        }

        public User build() {
            return user;
        }


    }

}
