public class Main {
    public static void main(String[] args) {
        System.out.println("Program zwraca macierz 10x10\n" +
                "Pierwsza kolumna wypełniona jest liczbami 0-9\n" +
                "Druga kolumna wypełniona jest potęgami drugiego stopnia z wartości pierwszej kolumny\n" +
                "Pozostałe kolumny wypełnione zostały liczbą 0\n" +
                "Program sumuje osobno wartości z pierwszej oraz drugiej kolumny");
        int sumaPierwszejKolumny = 0, sumaDrugiejKolumny = 0;
        int[][] macierz = new int[10][10];

        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz.length; j++) {
                if (j == 0) {
                    macierz[i][j] = i;
                    sumaPierwszejKolumny += i;
                } else if (j == 1) {
                    macierz[i][j] = i * i;
                    sumaDrugiejKolumny += i * i;
                } else {
                    macierz[i][j] = 0;
                }
            }
        }

        for (int[] x : macierz) {
            for (int y : x) {
                System.out.print(y + "\t");
            }
            System.out.println();
        }
        System.out.println("Suma pierwszej kolumny wynosi: " + sumaPierwszejKolumny);
        System.out.println("Suma drugiej kolumny wynosi: " + sumaDrugiejKolumny);
    }
}
