public class Main {
    public static void main(String[] args) {
        System.out.println("Program zwracający liczby całkowite z przedziału 0-20 używając pętli while");
        int i = 0;
        while (i <= 20) {
            if (i < 20) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i + ".");
            }
            i++;
        }

    }
}
