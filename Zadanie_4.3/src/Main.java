public class Main {
    public static void main(String[] args) {
        System.out.println("Program zwraca macierz 10x10, wypełnia wartościami 1 przekątną oraz sumuje jej wartości\n");
        int suma;
        int[][] macierz = new int[10][10];


        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz.length; j++) {
                if (i == j) {
                    macierz[i][j] = 1;
                } else {
                    macierz[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz.length; j++) {
                System.out.print(macierz[i][j] + "\t");
            }
            System.out.println();
        }

        suma = 0;
        for (int i = 0; i < macierz.length; i++) {
            suma += macierz[i][i];
        }
        System.out.println("\nSuma wartości na przekątnej wynosi: " + suma);
    }
}
