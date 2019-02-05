import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[]args ){
        System.out.println("Program sprawdzający możliwość zbudowanie trójkąta prostokątnego");
        double a;
        double b;
        double c;
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Podaj długość boku a: ");
            a = Double.parseDouble(br.readLine());
            System.out.println("Podaj długość boku b: ");
            b = Double.parseDouble(br.readLine());
            System.out.println("Podaj długość boku c: ");
            c = Double.parseDouble(br.readLine());

            if ((a*a+b*b)==c*c){
                System.out.println("Z podanych boków można zbudować trójkąt prostokątny");
            }else {
                System.out.println("Z podanych boków nie można zbudować trójkąta prostokątnego!");
            }

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
