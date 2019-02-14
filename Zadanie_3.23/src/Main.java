public class Main {
    public static void main(String[] args) {
        System.out.println("Program zwraca duże litery alfabetu A-Z uzywając pętli do ... while");
        char znak = 'A';
        do {
            if (znak < 'Z') {
                System.out.print(znak + ", ");

            } else {
                System.out.println(znak + ".");
            }
            znak++;
        } while (znak <= 'Z');

        znak = 'Z';
        do {

            if (znak > 'A') {
                System.out.print(znak + ", ");

            } else {
                System.out.println(znak + ".");
            }
            znak--;
        } while (znak >= 'A');
    }
}
