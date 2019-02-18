public class Main {
    public static void main(String[] args) {
        System.out.println("Program zwraca macierz 10x00\nWypełiona 0 oprócz jednej przekątnej która jest wypełniona wartością 1\n" +
                "program sumuje wartości przekątnej");

        int suma = 0;
        int[][] macierz = new int[10][10];

        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz.length; j++) {
                if ((i + j + 1) == macierz.length) {
                    macierz[i][j] = 1;
                    suma += macierz[i][j];
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
        System.out.println("Suma elementów znajdujących się na przekątnej wynosi: " + suma);
    }
}
