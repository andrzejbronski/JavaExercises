public class Main {
    public static void main(String[] args) {
        System.out.println("Program kopiuje wartości pomiędzy dwoma macierzami 10x10\n" +
                "Pierwsza macierz zawiera liczby 0-1\n" +
                "Druga macierz wypełniona jest zerami\n" +
                "Kopiowanie zamienia kolumnę z wierszem");
        int rozmiarMacierzy = 10;
        int[][] macierzA = new int[rozmiarMacierzy][rozmiarMacierzy];
        int[][] macierzB = new int[rozmiarMacierzy][rozmiarMacierzy];

        //deklaracja macierzy
        for (int i = 0; i < rozmiarMacierzy; i++) {
            for (int j = 0; j < rozmiarMacierzy; j++) {

                macierzA[i][j] = j;
                macierzB[i][j] = 0;
            }
        }

        System.out.println("Macierz A:");
        wyswietlMacierz(macierzA);

        System.out.println("Macierz B");
        wyswietlMacierz(macierzB);

        //kopiowanie macierzy
        for (int i = 0; i < rozmiarMacierzy; i++) {
            for (int j = 0; j < rozmiarMacierzy; j++) {
                macierzB[i][j] = macierzA[j][i];
            }
        }
        System.out.println("Macierz B po skopiowaniu i zamianie kolumn na wiersze");
        wyswietlMacierz(macierzB);
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
