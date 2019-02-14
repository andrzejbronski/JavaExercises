public class Main {
    public static void main(String[] args) {
        System.out.println("Program zwraca duże litery alfabetu A-Z uzywając pętli for");
        char znak;

        for (znak = 'A'; znak <= 'Z'; znak++) {

            if (znak < 'Z') {
                System.out.print(znak + ", ");
            } else {
                System.out.println(znak + ".");
            }
        }

        for (znak = 'Z'; znak >= 'A'; znak--) {
            if (znak > 'A') {
                System.out.print(znak + ", ");
            } else {
                System.out.print(znak + ". ");
            }
        }
    }
}
