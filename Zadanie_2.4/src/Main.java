import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Program wyznaczający wartość x z równania liniowego ax+b=c");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double a, b, c, x;
        System.out.println("Podaj wartość a:");
        a = Double.parseDouble(bufferedReader.readLine());

        if (a == 0) {
            System.err.println("Wartość \"a\" musi być większa od 0!");
            System.exit(0);
        } else {
            System.out.println("Podaj wartośc b:");
            b = Double.parseDouble(bufferedReader.readLine());
            System.out.println("Podaj wartość c:");
            c = Double.parseDouble(bufferedReader.readLine());

            x = (c-b)/a;

            System.out.println("Wartość x z równania liniowego dla: ");
            System.out.printf("a = "+"%4.2f\n",a);
            System.out.printf("b = "+"%4.2f\n",b);
            System.out.printf("c = "+"%4.2f\n",c);
            System.out.printf("wynosi: "+"%4.2f\n",x);
        }
    }
}
