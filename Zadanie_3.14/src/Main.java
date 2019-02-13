public class Main {
    public static void main(String[] args) {
        System.out.println("Program zwraca sumę liczb rzeczywistych, nieparzystych z przedziału 0-100 używając pętli do...while");

        int i = 1, sum = 0;

        do {
            if (!(i % 2 == 0)) sum += i;
            System.out.println("Suma wynosi: " + sum);
            i++;
        } while (i <= 100);
    }
}
