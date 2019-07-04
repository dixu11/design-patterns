package singleton.majster;

public class TestTablic {
    public static void main(String[] args) {
        int[] tab = Producent.stworz(50);
        for (int element:
             tab) {
            System.out.println(element);
        }

        System.out.println("\n\n\n\n");

        int[] filtrowanie = Wyszukiwacz.wyszukajWiekszeNiz(tab, 30);
        for (int element:
                filtrowanie) {
            System.out.println(element);
        }

        System.out.println("Wielkosc tablicy pierwszej: " + tab.length);
        System.out.println("Wielkosc tablicy otrzymanej: " + filtrowanie.length);
    }
}
