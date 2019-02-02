import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[]args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        float firstNumber, secondNumber;

        System.out.println("Program wyliczający sumę, różnicę, iloczyn, iloraz z podanych 2 liczb.");
        System.out.println("Podaj pierwszą liczbę:");
        firstNumber = Float.parseFloat(bf.readLine());
        System.out.println("Podaj drugą liczbę: ");
        secondNumber = Float.parseFloat(bf.readLine());

        System.out.printf("Suma podanych liczb wynosi: "+"%5.2f \n",firstNumber+secondNumber);
        System.out.printf("Różnica podanych liczb wynosi: "+"%5.2f\n",firstNumber-secondNumber);
        System.out.printf("Iloczyn podanych liczb wynosi: "+"%5.2f \n",firstNumber*secondNumber);
        System.out.printf("Iloraz podanych liczb wynosi: "+"%5.2f \f",firstNumber/secondNumber);


    }
}
