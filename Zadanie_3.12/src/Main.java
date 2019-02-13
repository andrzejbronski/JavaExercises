public class Main {
    public static void main(String[]args){
        System.out.println("Program zwraca sumę liczb rzeczywistych, parzystych z przedziału 0-100 używając pętli while");
        int i = 1, sum = 0;

        while (i <= 100){
            if (i%2 == 0) sum+=i;
            System.out.println("Suma wynosi: "+sum);
            i++;
        }
    }
}
