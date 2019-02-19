import java.util.Random;

class Matrix {
    void czytajDane(double[][] macierz, int rozmiar) {
        Random random = new Random();
        for (int i = 0; i < rozmiar; i++) {
            for (int j = 0; j < rozmiar; j++) {
                if (i == j) {
                    macierz[i][j] = Math.round(9 * (random.nextDouble()));
                } else {
                    macierz[i][j] = 0;
                }
            }
        }
    }

    void wykonaj(double[][] macierz, int rozmiar) {
        double suma = 0;
        for (int i = 0; i < rozmiar; i++) {
            suma += macierz[i][i];
        }
        System.out.println("Suma elementow wynosi: " + (int) suma);
    }

    void wyswietlWynik(double[][] macierz, int rozmiar) {
        for (double[] x : macierz) {
            for (double y : x) {
                System.out.print(y + "\t");
            }
            System.out.println();

        }
    }
}

public class Main {
    public static void main(String[] args) {
        int rozmiar = 9;
        double liczby[][] = new double[rozmiar][rozmiar];
        Matrix matrix = new Matrix();
        matrix.czytajDane(liczby, rozmiar);
        matrix.wykonaj(liczby, rozmiar);
        matrix.wyswietlWynik(liczby, rozmiar);

    }
}
