import sun.security.krb5.internal.TGSRep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        int x, los;
        System.out.println("Program zgadywanka - masz tylko jedną szansę aby odgadnąć liczbę wylosowaną z przediału 0-9");
        System.out.println("Podaj liczbę:");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        x = Integer.parseInt(bufferedReader.readLine());
        Random random = new Random();
        los = random.nextInt(9+1);

        System.out.print("Losuję ");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".\n");
        Thread.sleep(1000);
            if (x == los){
                System.out.println("Dobra robota!! Odgadłeś liczbę!");
            }else {
                System.out.println("Niestety nie udało się, wylosowana liczba to: "+los);
            }

    }
}
