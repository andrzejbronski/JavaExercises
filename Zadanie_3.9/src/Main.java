public class Main {
    public static void main(String[] args) {
        System.out.println("Program sumuje liczby całkowite z zakresu 0-100 używając pętlę while");
        int i = 0;
        int sum = 0;
            while (i <= 100) {

            sum += i;
            System.out.println("Iteracja nr." + i + " suma wynosi: " + sum);
            i++;
        }
    }
}
