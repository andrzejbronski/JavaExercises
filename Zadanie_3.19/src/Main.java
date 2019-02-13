public class Main {
    public static void main(String[] args) {
        System.out.println("Program wyświetlający  tabliczkę mnożenia - pętla for\n");
        for (int x = 1; x <= 10; x++) {

            for (int y = 1; y <= 10; y++) {
                System.out.print(x * y + "\t");
            }
            System.out.println();
        }
    }
}
