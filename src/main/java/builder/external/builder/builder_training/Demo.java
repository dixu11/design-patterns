package builder.external.builder.builder_training;

public class Demo {
    public static void main(String[] args) {
        User mojUser = User.create()
                .withName("Marcin")
                .withLastName("Chyla")
                .bornAt("1990")
                .withAge(28)
                .build();


    }
}
