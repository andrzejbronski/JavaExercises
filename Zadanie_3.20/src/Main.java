public class Main {
    public static void main(String[] args) {
        System.out.println("Program wyświetlający  tabliczkę mnożenia - pętla do ... while\n");
        int i = 1;

        do {
            int j = 1;
            do {
                System.out.print(i * j + "\t");
                j++;
            } while (j <= 10);
            System.out.println();
            i++;
        } while (i <= 10);
    }
}
