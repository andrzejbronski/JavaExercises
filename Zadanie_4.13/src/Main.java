import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String imie, nazwisko;

        System.out.println("Program zwraca długość łańcuchów string");
        System.out.println("Podaj imie:");
        imie = bufferedReader.readLine();
        System.out.println("Podaj nazwisko:");
        nazwisko = bufferedReader.readLine();

        System.out.println("Podane imię to: " + imie + " które składa się z: " + imie.length()+" liter");
        System.out.println("Podane nazwisko to: " + nazwisko + " które składa się z: " + nazwisko.length()+" liter");


    }
}
