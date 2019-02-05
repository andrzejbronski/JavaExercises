import javax.print.attribute.standard.NumberUp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double firstNumber;
        double secondNumber;
        double result;
        System.out.println("Program wyznaczający pole prostokąta - zabezpieczony try-catch");
        try {
            System.out.println("Podaj pierwszą liczbę: ");
            firstNumber = Double.parseDouble(br.readLine());
            System.out.println("Podaj drugą liczbę: ");
            secondNumber = Double.parseDouble(br.readLine());
            result = firstNumber * secondNumber;

            System.out.println("Pole prostokąta wynosi: "+result);
        }catch (InputMismatchException ex){
            System.err.println("Podano zły typ danych!!!");
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
        catch (NumberFormatException ex){
            System.err.println("Podałeś zły format liczby!");
        }
    }
}
