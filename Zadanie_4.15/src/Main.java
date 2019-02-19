public class Main {
    public static void main(String[] args) {
        System.out.println("Program sumuje wartości z zakresu 1-100");
        int suma;
        int[] liczby = new int[100];

        for (int i = 1; i <= liczby.length; i++) {
            liczby[i - 1] = i;
        }
        suma = 0;
        for (int x : liczby) {
            suma += x;
            System.out.println(x);
        }
        System.out.println("Suma liczb z zakresu 1-100 wynosi: " + suma);
    }
}
