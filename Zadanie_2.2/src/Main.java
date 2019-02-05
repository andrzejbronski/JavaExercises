import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[]args){

        double a,b,c,x1,x2, delta;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Podaj wartość a: ");
            a = Double.parseDouble(br.readLine());
            if (a == 0){
                System.out.println("Wartość a nie może być równa 0!");
            }else {
                System.out.println("Podaj wartość b: ");
                b = Double.parseDouble(br.readLine());
                System.out.println("Podaj wartość c: ");
                c = Double.parseDouble(br.readLine());
                delta = b*b-4*a*c;
                if (delta < 0) {
                    System.out.println("Brak pierwiastków rzeczywistych");
                }else if(delta == 0){
                    x1 = -b/(2*a);

                    System.out.println("Dla podanych wartości:");
                    System.out.printf("a = "+"%5.2f\n",a);
                    System.out.printf("b = "+"%5.2f\n",b);
                    System.out.printf("c = "+"%5.2f\n",c);
                    System.out.println("Trójmian ma jeden pierwiastek:");
                    System.out.printf("x1 = "+"%5.2f\n"+x1);
                }else if (delta > 0){
                    x1 = (-b-Math.sqrt(delta))/(2*a);
                    x2 = (-b+Math.sqrt(delta))/(2*a);

                    System.out.println("Dla podanych wartości:");
                    System.out.printf("a = "+"%5.2f\n",a);
                    System.out.printf("b = "+"%5.2f\n",b);
                    System.out.printf("c = "+"%5.2f\n",c);
                    System.out.println("Trójmian ma dwa pierwiastki:");
                    System.out.printf("x1 = "+"%5.2f\n",x1);
                    System.out.printf("x2 = "+"%5.2f\n",x2);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
