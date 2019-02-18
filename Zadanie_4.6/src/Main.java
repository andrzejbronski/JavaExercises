public class Main {
    public static void main(String[] args) {
        System.out.println("Program zwraca macierz 10x10\n" +
                "Jedna z przekątnych wypełniona jest liczbami 0-9\n" +
                "Program sumuje wartości znajdujące się na przekątnej");

        int suma = 0;
        int[][] macierz = new int[10][10];

        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz.length; j++) {
                if ((i + j + 1) == macierz.length) {
                    macierz[i][j] = i;
                    suma += i;
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
        System.out.println("Suma wartości znajdujących się na przekątnej wynosi: "+suma);
    }
}
