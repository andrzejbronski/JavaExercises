import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double result = 0;
        System.out.println("Program - Obliczenie pola prostokąta");
        System.out.println("Podaj długość boku a: ");
        a = scanner.nextDouble();
        scanner.nextLine();//consuming new line character
        System.out.println("Podaj długość boku b: ");
        b = scanner.nextDouble();
        result = a*b;
        System.out.println("Pole prostokąta wynosi: "+result);

    }
}
