public class Main {
    public static void main(String[] args) {
        int bolenSayac = 0;

        for (int i = 2; i < 100; i++) {
            for (int x = 2; x < i; x++) {
                if (i % x == 0) {
                    bolenSayac++;
                }

            }
            if (bolenSayac == 0){
                System.out.print(i + " ");
            }
            bolenSayac = 0;
        }
    }
}

