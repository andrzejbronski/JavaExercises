import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Program zapis/odczyt txt");
        Dane dane = new Dane();
        dane.pobierzDane();
        dane.zapiszDane();
        dane.odczytajDane();
    }
}

class Dane {
    private String imie;
    private String nazwisko;

    void pobierzDane() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj imie:");
        imie = bufferedReader.readLine();
        System.out.println("Podaj nazwisko:");
        nazwisko = bufferedReader.readLine();
    }

    void zapiszDane() throws IOException {
        FileWriter fileWriter = new FileWriter(new File("dane.txt"));
        fileWriter.write(imie + "\n");
        fileWriter.write(nazwisko);
        fileWriter.close();

    }

    void odczytajDane() throws IOException {
        String dane;
        FileReader fileReader = new FileReader("dane.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while ((dane = bufferedReader.readLine()) != null) {
            System.out.println(dane);
        }

    }
}
