public class Main {
    public static void main(String[] args) {
        System.out.println("Program zwraca sumę liczb rzeczywistych, parzystych z przedziału 0-100 używając pętli do...while");
        int sum = 0;
        int i = 1;
        do {
            if (i % 2 == 0) sum += i;
            System.out.println("Suma wynosi: " + sum);
             i++;
            } while (i <= 100);
    }
}
