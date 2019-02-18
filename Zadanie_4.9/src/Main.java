public class Main {
    public static void main(String[] args) {
        System.out.println("Program sumuje wartości dwóch macierzy");

        int rozmiarMacierzy = 10;
        int[][] a = new int[rozmiarMacierzy][rozmiarMacierzy];
        int[][] b = new int[rozmiarMacierzy][rozmiarMacierzy];
        int[][] c = new int[rozmiarMacierzy][rozmiarMacierzy];

        for (int i = 0; i < rozmiarMacierzy; i++) {
            for (int j = 0; j < rozmiarMacierzy; j++) {
                a[i][j] = 1;
                b[i][j] = 2;
            }
        }
        for (int i = 0; i < rozmiarMacierzy; i++) {
            for (int j = 0; j < rozmiarMacierzy; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Macierz a:");
        wyswietlMacierz(a);
        System.out.println("Macierz b");
        wyswietlMacierz(b);
        System.out.println("Suma macierzy a i b: ");
        wyswietlMacierz(c);
    }

    private static void wyswietlMacierz(int[][] macierz) {
        for (int[] x : macierz) {
            for (int y : x) {
                System.out.print(y + "\t");
            }
            System.out.println();
        }
    }
}
