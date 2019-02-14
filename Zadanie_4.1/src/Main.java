public class Main {
    public static void main(String[] args) {
        System.out.println("Program zwracający tablicę jednowymiarową liczb całkowitych z przedziału 0-10");
        int[] tablica = new int[10];

        for (int i = 0; i <= 10; i++) {
            tablica[i] = i;
            System.out.println("[" + tablica[i] + "]");
        }
    }
}
