public class Main {
    public static void main(String[] args) {
        System.out.println("Program - zastosowanie pętli do...while\n" +
                "Program wzwraca poszczególne wartości dla wyrażenia y=3x");
            int i = 0;
            int y;
        System.out.println("Wartość wyrażenia y=3x wynosi:");
        do{
            y = 3*i;
            System.out.println("dla x równego "+i+": "+y);
            i++;
        }while(i<=10);

    }
}
