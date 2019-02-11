import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Program obliczający pierwiastki równania kwadratowego");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double a, b, c, delta, x1, x2;
        int liczbaPierwiastkow = 3;
        System.out.println("Podaj wartość a: ");
        a = Double.parseDouble(bufferedReader.readLine());
        if (a == 0) {
            System.out.println("Niedowolona wartość współczynnika a!");
        } else {
            System.out.println("Podaj wartość b:");
            b = Double.parseDouble(bufferedReader.readLine());
            System.out.println("Podaj wartość c: ");
            c = Double.parseDouble(bufferedReader.readLine());
            delta = b * b - 4 * a * c;

            if (delta < 0) {
                liczbaPierwiastkow = 0;
            } else if (delta == 0) {
                liczbaPierwiastkow = 1;
            } else if (delta > 0) {
                liczbaPierwiastkow = 2;
            }
            switch (liczbaPierwiastkow) {
                case 0:
                    System.out.println("Brak pierwiastków rzeczywistych");
                    break;
                case 1: {
                    x1 = -b / (2 * a);
                    System.out.println("Trójmian ma jeden pierwiastek x1");
                    System.out.printf("%5.2f\n", x1);
                }
                    break;
                case 2:{
                    x1 = (-b-Math.sqrt(delta))/(2*a);
                    x2 = (-b+Math.sqrt(delta))/(2*a);
                    System.out.printf("x1 wynosi: "+"%4.2f\n",x1);
                    System.out.printf("x2 wynosi: "+"%4.2f\n",x2);
                }
                break;
                case 3:{
                    System.exit(0);
                }


            }
        }
    }
}
