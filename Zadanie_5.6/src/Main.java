import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Program zwraca kolejne liczby trójkątne");
        int n;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj ilość liczby trójkątnych do wyświetlenia: ");
        n = Integer.parseInt(bufferedReader.readLine());
        for (int i = 1; i <= n; i++) {
            System.out.println(Liczby.wyznacz(i));
        }

    }
}

class Liczby {

    static int wyznacz(int n) {
        if (n == 1) {

            return 1;
        } else {
            return (n + wyznacz(n - 1));
        }

    }
}
