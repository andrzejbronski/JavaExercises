import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Program łączy dwa łańcuchy string");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Podaj pierwszy wyraz:");
        String pierwszy = bufferedReader.readLine();
        System.out.println("Podaj drugi wyraz:");
        String drugi = bufferedReader.readLine();

        System.out.println("Konkatenacja dwóch stringów: " + pierwszy.concat(drugi));


    }
}