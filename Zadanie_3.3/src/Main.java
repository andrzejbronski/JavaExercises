public class Main {
    public static void main(String[] args){
        System.out.println("Program zwracający poszczególne wartości dla wyrażenia y = 3x z wykorzystaniem pętli while");
        int i = 0;
        System.out.println("Wartość wyrażenia dla:");
        while(i <= 10){
            System.out.println("x = "+i+" wynosi: "+(3*i));
            i++;
        }
    }
}
