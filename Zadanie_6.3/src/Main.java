import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Program operuje na tablicach 10x10");
        Macierz macierz = new Macierz();
        macierz.rysujMacierz();
        macierz.przerysuj();
        macierz.zapisz();
        macierz.odczytaj();
    }
}

class Macierz {
    private int[][] a = new int[10][10];
    private int[][] b = new int[10][10];
    private int[][] c = new int[10][10];

    void rysujMacierz() {
        System.out.println("Rysuję macierz");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 1) {
                    a[i][j] = 1;
                } else {
                    a[i][j] = 0;
                }
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

    void przerysuj() {
        System.out.println("Przerysowuję macież a do macierzy b");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                b[i][j] = a[j][i];
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }
    }

    void zapisz() throws IOException {

        FileWriter fileWriter = new FileWriter(new File("dane.txt"));
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                fileWriter.write((char) (b[i][j]));
            }
        }
        fileWriter.close();
        System.out.println("Zapisano macierz do pliku txt");
    }

    void odczytaj() throws IOException {
        System.out.println("Odczytjuę macierz z pliku");
        BufferedReader bufferedReader = new BufferedReader(new FileReader("dane.txt"));
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                c[i][j] = bufferedReader.read();
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
