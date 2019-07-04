package builder.external.builder;

import java.time.LocalDate;
import java.util.Vector;

public class Test {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
//        Collections.

        Customer marcin = new Customer.Builder("Marcin", "Chyla")
                .asProfession("rolnik")
                .livingInCity("Szczecin")
                .livingInCountry("Polsza")
                .withPesel("0700880880")
                .withBirthDate(LocalDate.of(1990, 12, 24))
                .build();

        System.out.println(marcin);
        Customer marcin2 = Customer.create("Marcin", "Chyla")
                .asProfession("rolnik")
                .livingInCity("Szczecin")
                .livingInCountry("Polsza")
                .withPesel("0700880880")
                .withBirthDate(LocalDate.of(1990, 12, 24))
                .build();


        Customer mojUser1 = new Customer.Builder("Zenon", "Kowalski")
                .withPesel("3242342344")
                .asProfession("kowal")
                .livingInCity("warszawa")
                .build();


        String string = "lol";
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.reverse();
        System.out.println(string.equals(sb.toString()));

        String[][] tablica2D = {
                {"A1", "A2", "A3", "A4"},
                {"B1", "B2", "B3", "B4", }
        };
        for (String[] tablica : tablica2D) {
            for (String slowo : tablica) {
                System.out.print(slowo + " ");
            }
            System.out.println();
        }




    }
}
