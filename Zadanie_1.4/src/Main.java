import java.lang.Math;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double radiusLength;
        double result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program obliczający pole kuli");
        System.out.println("Podaj promień koła: ");
        radiusLength = scanner.nextDouble();
        scanner.nextLine();
        System.out.printf("Podałeś promień o długości: "+"%5.2f \n",radiusLength);
        result = Math.pow(radiusLength,2);
        result = Math.PI*result;

        System.out.printf("Pole koła wynosi: "+"%5.2f",result);

    }
}
