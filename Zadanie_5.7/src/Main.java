import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Program zwraca kolejne liczby ciągu Fibonacciego");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int iloscLiczb = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < iloscLiczb; i++) {
            System.out.println(Liczby.wyznacz(i));
        }

    }
}

class Liczby {
    static int wyznacz(int n) {
        switch (n) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return wyznacz(n - 1) + wyznacz(n - 2);
        }
    }
}
