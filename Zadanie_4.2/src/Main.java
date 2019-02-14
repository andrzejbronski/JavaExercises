public class Main {
    public static void main(String[] args) {
        System.out.println("Program zwracający tablicę liczb rzeczywistych z przedziału 9 - 0");
        int[] tablica = new int[10];
        int wartosc = 9;

        for (int i = 0; i <= 9; i++) {
            tablica[i] = wartosc--;
            System.out.println("[" + tablica[i] + "]");
        }

    }
}
