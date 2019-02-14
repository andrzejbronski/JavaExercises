public class Main {
    public static void main(String[] args) {

        System.out.println("Program zwraca duże litery alfabetu A-Z uzywając pętli for");
        char znak = 'A';
        while (znak <= 'Z') {
            if (znak < 'Z') {
                System.out.print(znak + ",");
            } else {
                System.out.println(znak + ".");
            }
            znak++;
        }

        znak = 'Z';
        while (znak >= 'A') {
            if (znak > 'A') {
                System.out.print(znak + ",");
            } else {
                System.out.println(znak + ".");
            }
            znak--;
        }
    }
}
