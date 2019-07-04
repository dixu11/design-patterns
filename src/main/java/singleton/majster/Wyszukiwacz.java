package singleton.majster;

public class Wyszukiwacz {
    public static int[] wyszukajWiekszeNiz(int[] otrzymana, int minimalnaLiczba) {
        int[] tymczasowa = new int[otrzymana.length];
        int wielkoscNowejTablicy = 0;
        for (int i = 0; i < otrzymana.length; i++) {
            if (otrzymana[i] > 30) {
                tymczasowa[wielkoscNowejTablicy] = otrzymana[i];
                wielkoscNowejTablicy++;
            }
        }
        int[] pomniejszonaIOdfiltrowana = new int[wielkoscNowejTablicy];
        for (int i = 0; i < pomniejszonaIOdfiltrowana.length; i++) {
            pomniejszonaIOdfiltrowana[i] = tymczasowa[i];
        }
        return pomniejszonaIOdfiltrowana;
    }

    public static int[] wyszukajWspolne(int[] otrzymana1, int[] otrzymana2) {
        int[] tymczasowa;

        if (otrzymana1.length > otrzymana2.length) {
            tymczasowa = new int[otrzymana1.length];
        } else {
            tymczasowa = new int[otrzymana2.length];
        }
        int wielkoscNowejTablicy = 0;
        for (int i = 0 ; i< otrzymana1.length; i++) {
            int sprawdzana = Integer.MIN_VALUE;
            for (int j = 0; i< otrzymana2.length;i++) {
                if (sprawdzana == otrzymana2[j]) {
                    tymczasowa[wielkoscNowejTablicy] = sprawdzana;
                    wielkoscNowejTablicy++;
                    System.out.println("Wielkosc nowej tablicy: " + wielkoscNowejTablicy);
                    break;
                }
            }



        }



        return otrzymana1;
    }
    }

