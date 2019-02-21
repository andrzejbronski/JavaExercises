import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Program wyznacza silnie z podanej wartości");
        Silnia silnia = new Silnia();
        int n;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj wartość z jakiej wyznaczyć silnię:");
        n = Integer.parseInt(bufferedReader.readLine());
        for (int i = 1; i <= n; i++) {
            System.out.println(i + "!= " + silnia.obliczSilnie(i));
        }
    }

}

class Silnia {
    long obliczSilnie(int n) {
        long zwrot = 1;
        if (n >= 2) {
            zwrot = n * obliczSilnie(n - 1);
        }
        return zwrot;
    }
}

