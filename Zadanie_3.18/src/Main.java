import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Program losuje 5 liczb z przedziału 0-99,\nwyświetla największą oraz najmniejszą,\n" +
                "wylicza średnią ze wszystkich wylosowanych liczb - petla while.\n");
        Random random = new Random();

        int iloscLosowanychLiczb = 5, i = 0, min, max;
        min = random.nextInt(100);
        double srednia = min;
        max = min;
        System.out.println("Wylosowano liczby: \n" + min);

        while (i < iloscLosowanychLiczb - 1) {
            int wylosowanaLiczba = random.nextInt(100);
            System.out.println(wylosowanaLiczba);
            srednia += wylosowanaLiczba;
            if (wylosowanaLiczba < min) min = wylosowanaLiczba;
            if (wylosowanaLiczba > max) max = wylosowanaLiczba;
            i++;
        }
        System.out.println("Wartosc minimalna wylosowanych liczb wynosi: " + min);
        System.out.println("Wartosc maksymalna wylosowanych liczb wynosi: " + max);
        System.out.println(srednia);
        System.out.println("Wartosc srednia wynosi: " + (srednia / iloscLosowanychLiczb));
    }
}
