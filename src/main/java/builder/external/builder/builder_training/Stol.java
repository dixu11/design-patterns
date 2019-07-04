package builder.external.builder.builder_training;

public class Stol {
    private  String poleString;
    private String wysokosc;

    public Stol(String wysokosc) {
        this.wysokosc = wysokosc;
    }

    public  class Noga {
        private  String kolor;

        public Noga(String kolor) {
            this.kolor = kolor;
        }

        public  void wypiszKolor() {
            System.out.println(kolor);
        }

        public void wypiszKolorIndywidualny() {
            System.out.println(kolor + kolor);


        }
    }
}
