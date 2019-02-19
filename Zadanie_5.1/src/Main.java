import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PoleProstokata {
   private double a, b, pole;

    void czytajDane() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj bok a:");
        a = Double.parseDouble(bufferedReader.readLine());
        System.out.println("Podaj bok b:");
        b = Double.parseDouble(bufferedReader.readLine());
    }

     double oblicz() {
        return pole = a * b;
    }

     void wyswietlWynik() {
        System.out.printf("Obliczone pole wynosi: " + "%4.2f", pole);
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        PoleProstokata poleProstokata = new PoleProstokata();
        poleProstokata.czytajDane();
        poleProstokata.oblicz();
        poleProstokata.wyswietlWynik();

    }
}
