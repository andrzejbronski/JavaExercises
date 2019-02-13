import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program losuje 5 liczb z przedziału 0-99,\nwyświetla największą oraz najmniejszą,\n" +
                "wylicza średnią ze wszystkich wylosowanych liczb.\n");
        Random random = new Random();
        int max, min;
        int iloscLosowanychLiczb = 5;

        min = random.nextInt(100);
        double srednia = min;

        System.out.println("Wylosowano liczby:\n" + min);
        max = min;

        for (int i = 0; i < iloscLosowanychLiczb - 1; i++) {
            int los = random.nextInt(100);
            srednia += los;

            if (los < min) min = los;
            if (los > max) max = los;


            System.out.println(los);
        }
        System.out.println("\nWartosc minimalna wynosi: " + min);
        System.out.println("Wartosc maksymalna wynosi: " + max);
        System.out.println("Wartosc srednia wynosi: " + (srednia / 5));
    }
}
