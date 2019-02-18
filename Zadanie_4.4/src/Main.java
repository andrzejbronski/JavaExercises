public class Main {
    public static void main(String[] args) {
        System.out.println("Program zwraca macierz 10x10.\nNa przekątnej umieszcza liczby 0-9\nSumuje liczby na przekątnej");
        int suma;
        int[][] macierz = new int[10][10];

        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz.length; j++) {
                if (i == j) {
                    macierz[i][j] = i;
                } else {
                    macierz[i][j] = 0;
                }
            }
        }
        suma = 0;
        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz.length; j++) {
                if (i == j) {
                    suma += i;
                }
                System.out.print(macierz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Suma wynosi: " + suma);
    }
}
