
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Program zapisuje i odczytuje macierz do/z txt");
        int rozmiar = 10;
        int[][] tab = new int[rozmiar][rozmiar];
        Macierz macierz = new Macierz();
        macierz.rysuj(tab, rozmiar);
        macierz.zapisz(tab, rozmiar);
        macierz.odczytaj(tab,rozmiar);
    }
}

class Macierz {
    void rysuj(int[][] tablica, int rozmiar) {
        for (int i = 0; i <= rozmiar - 1; i++) {
            for (int j = 0; j <= rozmiar - 1; j++) {
                if (i == j) {
                    tablica[i][j] = 1;
                } else {
                    tablica[i][j] = 0;
                }
            }
        }
    }

    void zapisz(int[][] tablica, int rozmiar) throws IOException {

        FileWriter fileWriter = new FileWriter(new File("Dane.txt"));
        for (int[] x : tablica) {
            for (int y : x) {
                fileWriter.write(y + "\t");
            }
                fileWriter.write("\n");
        }
        fileWriter.close();
    }
    void odczytaj(int[][] tablica, int rozmiar) throws IOException{
        System.out.println("Odczytuję tablicę z pliku");
        FileReader fileReader = new FileReader("Dane.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        for (int i=0; i<=rozmiar-1;i++){
            for (int j=0;j<=rozmiar-1;j++){
                System.out.print(tablica[i][j]+"\t");
            }
            System.out.println();
        }



    }
}
