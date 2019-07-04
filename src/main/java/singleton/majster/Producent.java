package singleton.majster;

public class Producent {
    public static void main(String[] args) {

    }

    public static int[] stworz(int elementy) {
        int[]tablica = new int[elementy];
        for (int i = 0; i < elementy; i++) {
            tablica[i] = (int)(Math.random()*100+1);
            System.out.println(tablica[i]);
        }
        return tablica;
    }
}
