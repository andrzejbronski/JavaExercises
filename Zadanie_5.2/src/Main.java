import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Trojmian {
    private double a, b, c, delta, x1, x2;
    private char liczbaPierwiastkow;

    void czytajDane() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Podaj a:");
        a = Double.parseDouble(bufferedReader.readLine());
        if (a == 0) {
            System.out.println("Wartość a nie może być równa 0!");
            System.exit(0);
        } else {
            System.out.println("Podaj b:");
            b = Double.parseDouble(bufferedReader.readLine());
            System.out.println("Podaj c:");
            c = Double.parseDouble(bufferedReader.readLine());
        }
    }

    void oblicz() {
        delta = b * b - 4 * a * c;
        if (delta < 0) liczbaPierwiastkow = 0;
        if (delta == 0) liczbaPierwiastkow = 1;
        if (delta > 0) liczbaPierwiastkow = 2;
        switch (liczbaPierwiastkow) {
            case 1:
                x1 = -b / (2 * a);
                break;
            case 2: {
                x1 = (-b - Math.sqrt(delta)) / (2 * a);
                x2 = (-b + Math.sqrt(delta)) / (2 * a);
            }
            break;
        }
    }

    void wyswietlWynik() {
        System.out.println("Dla podanych wartości: " + a + " " + b + " " + c);
        switch (liczbaPierwiastkow) {
            case 0: {
                System.out.println("Brak pierwiastków rzeczywistych");
                break;
            }
            case 1: {
                System.out.print("Jednen pierwiastek:");
                System.out.printf("%4.2f", x1);
                break;
            }
            case 2: {
                System.out.print("Dwa pierwiastki: ");
                System.out.printf("%4.2f\t", x1);
                System.out.printf("%4.2f", x2);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        Trojmian trojmian = new Trojmian();
        System.out.println("Program zwraca pierwiastki równania kradratowego dla podanych wartości");
        trojmian.czytajDane();
        trojmian.oblicz();
        trojmian.wyswietlWynik();
    }
}
